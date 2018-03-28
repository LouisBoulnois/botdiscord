package game.personnages;

import game.Stats.Caracteristique;

public class Personnage {
    private String nom;
    private int niveau;
    private Caracteristique carac;
    private int vie;

    public Personnage(String nom){
        this.nom=nom;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Caracteristique getCarac() {
        return carac;
    }

    public void setCarac(Caracteristique carac) {
        this.carac = carac;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
}
