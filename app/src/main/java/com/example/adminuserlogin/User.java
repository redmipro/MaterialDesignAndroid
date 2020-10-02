package com.example.adminuserlogin;

public class User {

    private String nombreCompleto;
    private String email;
    private String password;
    private String confirmPassword;

    public User() {
    }

    public User(String nombreCompleto, String email, String password, String confirmPassword) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
