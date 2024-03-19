package fr.isep.TP4.exo2.pianos;

import fr.isep.TP4.exo2.Instrument;

public class PianoDroit extends Piano implements Instrument {

    private int cordage;
    public static final int DROIT = 0;
    public static final int CROISE = 1;
    private boolean silencieux;

    public PianoDroit(){}

    public PianoDroit(int cordage, boolean silencieux, int longueur, int largeur, int prixAchat, int prixVente) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.longueur = longueur;
        this.largeur = largeur;
        this.cordage = cordage;
        this.silencieux = silencieux;
        this.setNom("Piano Droit");
    }

    public PianoDroit(int cordage, boolean silencieux, int nombreTouches, int longueur, int largeur, int prixAchat, int prixVente) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nombreTouches = nombreTouches;
        this.cordage = cordage;
        this.silencieux = silencieux;
        this.setNom("Piano Droit");
    }

    public int getCordage() {
        return cordage;
    }

    public boolean isSilencieux() {
        return silencieux;
    }

    public void setCordage(int cordage) {
        this.cordage = cordage;
    }

    public void setSilencieux(boolean silencieux) {
        this.silencieux = silencieux;
    }

    @Override
    public String ficheTechnique() {
        return this.nom + " : \n" + "Dimensions : " + this.longueur + " x " + this.largeur + "\nCordage : " + this.cordage + "\nNombre de touches : " + this.nombreTouches + "\nSilencieu : " + (this.silencieux ?"✓" : "𐄂") +"\nPrix achat : " + this.prixAchat + "\nPrix vente : "+this.prixVente;
    }
}
