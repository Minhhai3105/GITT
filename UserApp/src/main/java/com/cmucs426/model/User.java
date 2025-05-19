package com.cmucs426.model;

public class User {
    private String userId;
    private String email;
    private String password;

    // Constructor
    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    // Getter and Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    // Change password method
    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }

    // Optional: for testing purposes
    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password; // In real applications, avoid this for security!
    }
    public static void main(String[] args) {
        
    }
}
