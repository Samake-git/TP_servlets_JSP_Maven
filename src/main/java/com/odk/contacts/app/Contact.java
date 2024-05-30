/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odk.contacts.app;

/**
 *
 * @author bakary.samake
 */
// Contact.java

public class Contact {
    private int id;
    private String nom;
    private String prenom;
    private String numero;
    private String competence;

    // Constructors, getters, and setters
    public Contact() {}
    
    public Contact(int id, String nom, String prenom, String numero, String competence) {
        this.id= id;
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.competence = competence;
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getCompetence() { return competence; }
    public void setCompetence(String competence) { this.competence = competence; }
}

