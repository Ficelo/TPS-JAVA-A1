package fr.isep.TP4.exo2.pianos;

import fr.isep.TP4.exo2.Instrument;

public class PianoNumerique extends Piano implements Instrument {

    private boolean toucherLourd;
    private int qualiteEchantillonage;

    public PianoNumerique(){}

    public PianoNumerique(boolean toucherLourd, int qualiteEchantillonage, int longueur, int largeur, int prixAchat, int prixVente) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.longueur = longueur;
        this.largeur = largeur;
        this.toucherLourd = toucherLourd;
        this.qualiteEchantillonage = qualiteEchantillonage;
        this.setNom("Piano numérique");
    }

    public PianoNumerique(boolean toucherLourd, int qualiteEchantillonage, int nombreTouches, int longueur, int largeur, int prixAchat, int prixVente) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nombreTouches = nombreTouches;
        this.toucherLourd = toucherLourd;
        this.qualiteEchantillonage = qualiteEchantillonage;
        this.setNom("Piano numérique");
    }

    public boolean isToucherLourd() {
        return toucherLourd;
    }

    public int getQualiteEchantillonage() {
        return qualiteEchantillonage;
    }

    public void setToucherLourd(boolean toucherLourd) {
        this.toucherLourd = toucherLourd;
    }

    public void setQualiteEchantillonage(int qualiteEchantillonage) {
        this.qualiteEchantillonage = qualiteEchantillonage;
    }

    @Override
    public String ficheTechnique() {
        return this.nom + " : \n" + "Dimensions : " + this.longueur + " x " + this.largeur + "\nQualité échantillonage : " + this.qualiteEchantillonage + "\nNombre de touches : " + this.nombreTouches + "\nToucher lourd : " + (this.toucherLourd ?"✓" : "𐄂") +"\nPrix achat : " + this.prixAchat + "\nPrix vente : "+this.prixVente;
    }
}
