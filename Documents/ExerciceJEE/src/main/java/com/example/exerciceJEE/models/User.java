package com.example.exercice04.models;



public class User {
    private String username;
    private String email;
    private String motDePasse;

    public User(String username, String email, String motDePasse) {
        this.username = username;
        this.email = email;
        this.motDePasse = motDePasse;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
