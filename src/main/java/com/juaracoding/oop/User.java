package com.juaracoding.oop;

public class User {

    private String username;
    private String password;
    private String newPassword;
    private String confirmPassword;
    private String currentPassword;


    //read only get
    //write only set

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    //function changePassword
    //currentPassword, newPassword, confirmPassword
    public void changePassword(String currentPassword, String newPassword, String confirmPassword){
        boolean isCurrentPassword = getPassword().equals(getCurrentPassword());
        if(isCurrentPassword) {
            if (getNewPassword().equals(getConfirmPassword())) {
                System.out.println("Password berhasil diubah");
            } else {
                System.out.println("New Password dan Confirm Password tidak Sama");
            }
        } else {
                System.out.println("Old Password tidak Sama");
            }
        }

    }

