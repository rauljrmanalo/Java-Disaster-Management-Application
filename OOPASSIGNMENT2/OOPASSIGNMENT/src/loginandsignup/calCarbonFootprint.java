/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandsignup;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author tlmni
 */
public class calCarbonFootprint extends javax.swing.JFrame {

    /**
     * Creates new form CalCarbonFootprint
     */
    public calCarbonFootprint() {
        initComponents(); // Initialize components
        
        // Set the default close operation to dispose this frame only
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GreenTop = new javax.swing.JPanel();
        OurSejahteraUserPanel = new javax.swing.JLabel();
        distanceField = new javax.swing.JTextField();
        fuelEfficiencyField = new javax.swing.JTextField();
        fuelTypeComboBox = new javax.swing.JComboBox<>();
        calculateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resultgrid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        GreenTop.setBackground(new java.awt.Color(0, 102, 102));
        GreenTop.setPreferredSize(new java.awt.Dimension(1000, 100));

        OurSejahteraUserPanel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        OurSejahteraUserPanel.setForeground(new java.awt.Color(255, 255, 255));
        OurSejahteraUserPanel.setText("Carbon Footprint Calculator");

        javax.swing.GroupLayout GreenTopLayout = new javax.swing.GroupLayout(GreenTop);
        GreenTop.setLayout(GreenTopLayout);
        GreenTopLayout.setHorizontalGroup(
            GreenTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GreenTopLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(OurSejahteraUserPanel)
                .addContainerGap(427, Short.MAX_VALUE))
        );
        GreenTopLayout.setVerticalGroup(
            GreenTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GreenTopLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(OurSejahteraUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        distanceField.setText("0");
        distanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanceFieldActionPerformed(evt);
            }
        });

        fuelEfficiencyField.setText("0");

        fuelTypeComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fuelTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasoline", "Diesel", "Electric" }));
        fuelTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelTypeComboBoxActionPerformed(evt);
            }
        });

        calculateButton.setBackground(new java.awt.Color(0, 102, 102));
        calculateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calculateButton.setForeground(new java.awt.Color(255, 255, 255));
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Type:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Distance (km) : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Fuel Efficiency (litres):");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Result:");

        resultgrid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultgrid.setEnabled(false);
        resultgrid.setSelectionColor(new java.awt.Color(153, 204, 255));
        resultgrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultgridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GreenTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultgrid, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(357, 357, 357))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuelEfficiencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(distanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(fuelTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(GreenTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuelTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fuelEfficiencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(distanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(calculateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultgrid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Action listener for the calculate button
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        calculateCarbonFootprint();// Call method to calculate carbon footprint
    }//GEN-LAST:event_calculateButtonActionPerformed

    // Action listener for the fuel type combo box (currently empty)
    private void fuelTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuelTypeComboBoxActionPerformed

    // Action listener for the result text field (currently empty)
    private void resultgridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultgridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultgridActionPerformed

    // Action listener for the distance text field (currently empty)
    private void distanceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distanceFieldActionPerformed


     // Method to calculate carbon footprint based on user input
    private void calculateCarbonFootprint() {
        try {
            double distance = Double.parseDouble(distanceField.getText()); // Get distance input
            double fuelEfficiency = Double.parseDouble(fuelEfficiencyField.getText()); // Get fuel efficiency input
            String fuelType = (String) fuelTypeComboBox.getSelectedItem(); // Get selected fuel type

            double carbonFootprint = calculateCarbonFootprint(distance, fuelEfficiency, fuelType); // Calculate carbon footprint
            resultgrid.setText(String.format("Estimated Carbon Footprint: %.2f kg CO2", carbonFootprint)); // Display result
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

     // Method to calculate carbon footprint based on distance, fuel efficiency, and fuel type
    private double calculateCarbonFootprint(double distance, double fuelEfficiency, String fuelType) {
        double carbonFactor;
        switch (fuelType) {
            case "Gasoline":
                carbonFactor = 2.31; // kg CO2 per liter (example value, adjust as needed)
                break;
            case "Diesel":
                carbonFactor = 2.68; // kg CO2 per liter (example value, adjust as needed)
                break;
            case "Electric":
                carbonFactor = 0.09; // kg CO2 per km for electric cars (example value, adjust as needed)
                break;
            default:
                throw new IllegalArgumentException("Invalid fuel type"); // Throw exception for invalid fuel type
        }

        return (distance / fuelEfficiency) * carbonFactor; // Return calculated carbon footprint
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GreenTop;
    private javax.swing.JLabel OurSejahteraUserPanel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField distanceField;
    private javax.swing.JTextField fuelEfficiencyField;
    private javax.swing.JComboBox<String> fuelTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resultgrid;
    // End of variables declaration//GEN-END:variables
}
