package org.example.models;

import java.sql.Date;

public class Produit {
    private int id;
    private int fk_image;
    private String nom;
    private String description;
    private int quantité;

    public Produit(int id, int fk_image, String nom, String description, int quantité, double prix, Date date_creation) {
        this.id = id;
        this.fk_image = fk_image;
        this.nom = nom;
        this.description = description;
        this.quantité = quantité;
        this.prix = prix;
        this.date_creation = date_creation;
    }

    private double prix;
    private Date date_creation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_image() {
        return fk_image;
    }

    public void setFk_image(int fk_image) {
        this.fk_image = fk_image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
}
