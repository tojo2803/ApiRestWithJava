package org.example.models;

import java.sql.Date;

public class Mouvement {
    private int id;
    private int fk_produit;
    private int fk_user;
    private String type_mouvement;
    private double quantité;
    private Date date_mouvement;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_produit() {
        return fk_produit;
    }

    public void setFk_produit(int fk_produit) {
        this.fk_produit = fk_produit;
    }

    public int getFk_user() {
        return fk_user;
    }

    public void setFk_user(int fk_user) {
        this.fk_user = fk_user;
    }

    public String getType_mouvement() {
        return type_mouvement;
    }

    public void setType_mouvement(String type_mouvement) {
        this.type_mouvement = type_mouvement;
    }

    public double getQuantité() {
        return quantité;
    }

    public void setQuantité(double quantité) {
        this.quantité = quantité;
    }

    public Date getDate_mouvement() {
        return date_mouvement;
    }

    public void setDate_mouvement(Date date_mouvement) {
        this.date_mouvement = date_mouvement;
    }

    public Mouvement(int id, int fk_produit, int fk_user, String type_mouvement, double quantité, Date date_mouvement) {
        this.id = id;
        this.fk_produit = fk_produit;
        this.fk_user = fk_user;
        this.type_mouvement = type_mouvement;
        this.quantité = quantité;
        this.date_mouvement = date_mouvement;
    }
}
