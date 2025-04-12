/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practice75;

/**
 *
 * @author LAPTOP AK
 */
public class User {

    private String userId;
    private String email;
    private String password;

    // Constructor
    public User(String userId, String email, String password) {
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

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
