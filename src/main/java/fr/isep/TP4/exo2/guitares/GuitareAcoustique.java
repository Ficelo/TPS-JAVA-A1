package fr.isep.TP4.exo2.guitares;

import fr.isep.TP4.exo2.Instrument;

public class GuitareAcoustique extends Guitare implements Instrument {

    private boolean mainDominante;
    public static final boolean DROITIER = false;
    public static final boolean GAUCHER = true;

    private int tirant;

    public GuitareAcoustique(){}

    public GuitareAcoustique(boolean mainDominante, int tirant, int longueur, int largeur, int prixAchat, int prixVente) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.longueur = longueur;
        this.largeur = largeur;
        this.mainDominante = mainDominante;
        this.tirant = tirant;
        this.setNom("Guitare acoustique");
    }

    public boolean isMainDominante() {
        return mainDominante;
    }

    public void setMainDominante(boolean mainDominante) {
        this.mainDominante = mainDominante;
    }

    public int getTirant() {
        return tirant;
    }

    public void setTirant(int tirant) {
        this.tirant = tirant;
    }

    @Override
    public String ficheTechnique() {
        return this.nom + " : \n" + "Dimensions : " + this.longueur + " x " + this.largeur + "\nMain dominante : " + (this.mainDominante ? "Gauche" : "Droite") + "\nTirant :" + this.tirant +"\nPrix achat : " + this.prixAchat + "\nPrix vente : "+this.prixVente;
    }
}
