package loginandsignup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * User class to handle user data and file operations
 */
public class User {
    private String username;
    private String email;
    private String password;
    private String role;

    // Constructor to initialize all user details
    public User(String username, String email, String password, String role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    
    // Constructor to initialize username only, for lookup purposes
    public User(String username) {
        this.username = username;
    }

    User(String username, String role) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getter for username
    public String getUsername() {
        return username;
    }
    
    // Getter for email
    public String getEmail() {
        return email;
    }
    
    // Getter for password
    public String getPassword() {
        return password;
    }
    
    // Getter for role, retrieves role from file based on username
    public String getRole() {
        return readRoleFromFile(username);
    }
    
    // Method to insert user into the users.txt file
    public boolean insertUser() {
        // Check if user already exists
        if (getUser() == null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
                // Write user details to the file
                writer.write(this.username + "," + this.email + "," + this.password + "," + this.role);
                writer.newLine(); // Move to the next line
                return true; // Return true if write operation is successful
            } catch (IOException e) {
                return false; // Return false if there is an IOException
            }
        }
        return false; // Return false if user already exists
    }
    
    // Method to retrieve user details from the users.txt file
    public User getUser() {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Split each line by commas
                if (parts[0].equals(this.username)) {
                    // Return a new User object if username matches
                    return new User(parts[0], parts[1], parts[2], parts[3]);
                }
            }
        } catch (IOException e) {
            return null; // Return null if there is an IOException
        }
        return null; // Return null if user is not found
    }
    
    // Private method to read the role of a user from the file based on username
    private String readRoleFromFile(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Split each line by commas
                if (parts[0].equals(username)) {
                    return parts[3]; // Return role if username matches
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace if there is an IOException
        }
        return null; // Return null if role is not found
    }
    
    // Method to retrieve all users from the users.txt file as an ArrayList
    public ArrayList<User> getUserArrayList() {
        ArrayList<User> tempUser = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Split each line by commas
                if (parts.length >= 4) {
                    // Add a new User object to the ArrayList if line has at least 4 parts
                    User u = new User(parts[0], parts[1], parts[2], parts[3]);
                    tempUser.add(u);
                }
            }
        } catch (IOException e) {
            return null; // Return null if there is an IOException
        }
        return tempUser; // Return the ArrayList of users
    }
}
