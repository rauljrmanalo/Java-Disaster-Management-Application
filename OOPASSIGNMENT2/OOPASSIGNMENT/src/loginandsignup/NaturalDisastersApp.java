package loginandsignup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NaturalDisastersApp extends JFrame implements ActionListener {

    private User currentUser;
    public DefaultListModel<String> announcementListModel;
    JList<String> announcementList;

    JMenu postsMenu;
    JMenu shareMenu;
    JMenu helpMenu;
    JMenu calculateMenu; // New menu for Calculate
    JMenuItem viewPosts;
    JMenuItem sharePosts;
    JMenuItem deletePosts;
    JMenuItem shareAnnouncements; // New menu item for sharing announcements
    JMenuItem tsunamis;
    JMenuItem hurricanes;
    JMenuItem earthquakes;
    JMenuItem tornadoes;
    JMenuItem wildfires;
    JMenuItem volcanicEruptions;
    JMenuItem blizzards;
    JMenuItem floods;
    JMenuItem calculateCarbonFootprint; // New menu item

    JButton logoutButton;
    JButton deleteAnnouncementButton; // Button to delete the selected announcement

    private static final String ANNOUNCEMENTS_FILE = "announcements.txt";

    NaturalDisastersApp(User currentUser) {
        this.currentUser = currentUser;

        // Set default close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);

        // Create a panel with a BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Initialize menu bar and menus with centered, larger font
        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(800, 40));
        menuBar.setFont(new Font("Arial", Font.BOLD, 16)); // Adjust font size and style
        menuBar.setBackground(new Color(0, 102, 102)); // Set background color

        // Logout button
        logoutButton = new JButton("Logout");
        logoutButton.setFont(new Font("Arial", Font.BOLD, 16));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setBackground(new Color(0, 102, 102));
        logoutButton.setBorderPainted(false);
        logoutButton.setFocusPainted(false);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Redirect to Login.java
                Login loginFrame = new Login();
                loginFrame.setVisible(true);
                loginFrame.pack();
                loginFrame.setLocationRelativeTo(null);
                // Close the current frame
                dispose();
            }
        });

        // Posts menu items
        postsMenu = new JMenu("Posts");
        customizeMenu(postsMenu);

        viewPosts = new JMenuItem("View Posts");
        viewPosts.addActionListener(this);
        postsMenu.add(viewPosts);

        // Share menu items
        shareMenu = new JMenu("Share");
        customizeMenu(shareMenu);

        sharePosts = new JMenuItem("Share posts");
        deletePosts = new JMenuItem("Delete posts");
        sharePosts.addActionListener(this);
        deletePosts.addActionListener(this);
        shareMenu.add(sharePosts);
        shareMenu.add(deletePosts);

        shareAnnouncements = new JMenuItem("Share Announcements");
        shareAnnouncements.addActionListener(this);
        if ("admin".equals(currentUser.getRole())) {
            JMenu announcementsMenu;
            // Announcements menu items
            announcementsMenu = new JMenu("Announcements");
            customizeMenu(announcementsMenu);
            menuBar.add(announcementsMenu);
            announcementsMenu.add(shareAnnouncements);

            // Button to delete the selected announcement for admin
            deleteAnnouncementButton = new JButton("Delete Announcement");
            deleteAnnouncementButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedIndex = announcementList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        announcementListModel.remove(selectedIndex);
                        saveAnnouncementsToFile();
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select an announcement to delete.");
                    }
                }
            });
            mainPanel.add(deleteAnnouncementButton, BorderLayout.SOUTH);
        }

        // Help menu items
        helpMenu = new JMenu("Help");
        customizeMenu(helpMenu);

        tsunamis = new JMenuItem("Tsunamis");
        hurricanes = new JMenuItem("Hurricanes");
        earthquakes = new JMenuItem("Earthquakes");
        tornadoes = new JMenuItem("Tornadoes");
        wildfires = new JMenuItem("Wildfires");
        volcanicEruptions = new JMenuItem("Volcanic eruptions");
        blizzards = new JMenuItem("Blizzards");
        floods = new JMenuItem("Floods");
        tsunamis.addActionListener(this);
        hurricanes.addActionListener(this);
        earthquakes.addActionListener(this);
        tornadoes.addActionListener(this);
        wildfires.addActionListener(this);
        volcanicEruptions.addActionListener(this);
        blizzards.addActionListener(this);
        floods.addActionListener(this);
        helpMenu.add(tsunamis);
        helpMenu.add(hurricanes);
        helpMenu.add(earthquakes);
        helpMenu.add(tornadoes);
        helpMenu.add(wildfires);
        helpMenu.add(volcanicEruptions);
        helpMenu.add(blizzards);
        helpMenu.add(floods);

        // Calculate menu with "Calculate Carbon Footprint" item
        calculateMenu = new JMenu("Calculate");
        customizeMenu(calculateMenu);

        calculateCarbonFootprint = new JMenuItem("Calculate Carbon Footprint");
        calculateCarbonFootprint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open calCarbonFootprint.java
                new calCarbonFootprint().setVisible(true);
            }
        });
        calculateMenu.add(calculateCarbonFootprint);

        // Adding menus to the menu bar
        menuBar.add(postsMenu);
        menuBar.add(shareMenu);
        menuBar.add(helpMenu);
        menuBar.add(calculateMenu); // Add calculateMenu to the menu bar
        // Add the logout button to the left of the menu bar
        menuBar.add(logoutButton);

        this.setJMenuBar(menuBar);

        // Announcement panel on the right
        announcementListModel = new DefaultListModel<>();
        announcementList = new JList<>(announcementListModel);
        JScrollPane announcementScrollPane = new JScrollPane(announcementList);
        announcementScrollPane.setPreferredSize(new Dimension(250, 0));
        mainPanel.add(announcementScrollPane, BorderLayout.EAST);

        JPanel sdgPanel = new JPanel(new BorderLayout());
        sdgPanel.setBackground(new Color(240, 240, 240));
        sdgPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel sdgLabel = new JLabel("<html><div style='text-align: center; font-size: 14px;'><b>Sustainable Development Goal 13 (SDG 13)</b><br><br>" +
                "<b>Climate action is one of 17 SDGs established by the United Nations in 2015.</b><br>" +
                "The official mission statement of this goal is to<br>" +
                "\"<i>Take urgent action to combat climate change and its impacts</i>\".<br><br>" +
                "<b>Target 13.3:</b> Improve education, awareness-raising, and human and institutional capacity on climate change mitigation, adaptation, impact reduction, and early warning.</div></html>");
        sdgLabel.setHorizontalAlignment(SwingConstants.CENTER);

        sdgPanel.add(sdgLabel, BorderLayout.CENTER);
        mainPanel.add(sdgPanel, BorderLayout.CENTER);

        this.add(mainPanel);
        this.setVisible(true);

        loadAnnouncementsFromFile();
    }

    private void customizeMenu(JMenu menu) {
        menu.setHorizontalAlignment(SwingConstants.CENTER); // Center align the menu text
        menu.setHorizontalTextPosition(SwingConstants.CENTER);
        menu.setFont(new Font("Arial", Font.BOLD, 16)); // Adjust font size and style
        menu.setForeground(Color.WHITE); // Set text color to white
    }

    private void loadAnnouncementsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ANNOUNCEMENTS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                announcementListModel.addElement(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveAnnouncementsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ANNOUNCEMENTS_FILE))) {
            for (int i = 0; i < announcementListModel.size(); i++) {
                writer.write(announcementListModel.getElementAt(i));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();

        if (source == viewPosts) {
            new ViewPosts().setVisible(true);
        } else if (source == sharePosts) {
            new SharePosts().setVisible(true);
        } else if (source == deletePosts) {
            new DeletePosts().setVisible(true);
        } else if (source == shareAnnouncements) {
            // Handle share announcements menu item action
            String announcement = JOptionPane.showInputDialog(this, "Enter announcement:");
            if (announcement != null && !announcement.trim().isEmpty()) {
                announcementListModel.addElement(announcement);
                saveAnnouncementsToFile();
            }
        } else if (source == tsunamis) {
            showInformationDialog("Tsunamis Information", "Tsunamis are large ocean waves caused by sudden movements on the ocean floor, including earthquakes, landslides, or volcanic eruptions. \n Call 999 for help");
        } else if (source == hurricanes) {
            showInformationDialog("Hurricanes Information", "Hurricanes are powerful tropical storms with strong winds and heavy rain, originating over warm ocean waters. \n Call 999 for help");
        } else if (source == earthquakes) {
            showInformationDialog("Earthquakes Information", "Earthquakes are sudden shaking of the ground caused by the movement of tectonic plates beneath the Earth's surface. \n Call 999 for help");
        } else if (source == tornadoes) {
            showInformationDialog("Tornadoes Information", "Tornadoes are rapidly rotating columns of air that extend from thunderstorms to the ground, causing severe damage. \n Call 999 for help");
        } else if (source == wildfires) {
            showInformationDialog("Wildfires Information", "Wildfires are uncontrolled fires that spread rapidly through vegetation, often caused by human activity or natural phenomena. \n Call 999 for help");
        } else if (source == volcanicEruptions) {
            showInformationDialog("Volcanic Eruptions Information", "Volcanic eruptions occur when magma, gas, and ash are expelled from a volcano, causing widespread destruction. \n Call 999 for help");
        } else if (source == blizzards) {
            showInformationDialog("Blizzards Information", "Blizzards are severe snowstorms characterized by strong winds, low visibility, and freezing temperatures. \n Call 999 for help");
        } else if (source == floods) {
            showInformationDialog("Floods Information", "Floods are overflow of water onto normally dry land, often caused by heavy rain, storms, or melting snow. \n Call 999 for help");
        }
    }

    private void showInformationDialog(String title, String message) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // Assuming you have a currentUser object
        User currentUser = new User("admin", "admin"); // For testing, you can replace with actual user object
        new NaturalDisastersApp(currentUser);
    }
}
