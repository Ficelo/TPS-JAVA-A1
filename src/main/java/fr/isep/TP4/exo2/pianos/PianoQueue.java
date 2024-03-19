package fr.isep.TP4.exo2.pianos;

import fr.isep.TP4.exo2.Instrument;

public class PianoQueue extends Piano implements Instrument {

    private String taille;
    public static final String QUATRESURQUATRE= "4/4";
    public static final String UNSURDEUX = "1/2";
    public static final String UNSURQUATRE ="1/4";
    public static final String CRAPAUD = "crapaud";

    public PianoQueue() {
    }

    public PianoQueue(String taille, int longueur, int largeur, int prixAchat, int prixVente) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.taille = taille;
        this.setNom("Piano à queue");
    }

    public PianoQueue(String taille, int nombreTouches, int longueur, int largeur, int prixAchat, int prixVente) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nombreTouches = nombreTouches;
        this.taille = taille;
        this.setNom("Piano à queue");
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    @Override
    public String ficheTechnique() {
        return this.nom + " : \n" + "Dimensions : " + this.longueur + " x " + this.largeur + "\nTaille : " + this.taille + "\nNombre de touches : " + this.nombreTouches +"\nPrix achat : " + this.prixAchat + "\nPrix vente : "+this.prixVente;
    }
}
