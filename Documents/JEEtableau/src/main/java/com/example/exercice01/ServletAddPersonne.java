package com.example.exercice01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Personne;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "servletAddPersonne", value = "/servletAddPersonnes")
public class  ServletAddPersonne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupération des données du formulaire
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        int age = Integer.parseInt(request.getParameter("age"));


        Personne personne = new Personne();
        personne.setFirstname(nom);
        personne.setLastname(prenom);
        personne.setYears(age);

        // Affichage en console
        System.out.println("Nouvelle personne ajoutée :");
        System.out.println("Nom : " + personne.getNom());
        System.out.println("Prénom : " + personne.getPrenom());
        System.out.println("Âge : " + personne.getAge());

    }
}
