package fr.isep.TP4.exo2.guitares;

import fr.isep.TP4.exo2.Instrument;

public class GuitareElectrique extends Guitare implements Instrument {

    private boolean ampliFourni;
    private boolean pedaleFournie;

    public GuitareElectrique(){}

    public GuitareElectrique(boolean ampliFourni, boolean pedaleFournie, int longueur, int largeur, int prixAchat, int prixVente) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.longueur = longueur;
        this.largeur = largeur;
        this.ampliFourni = ampliFourni;
        this.pedaleFournie = pedaleFournie;
        this.setNom("Guitare Electrique");
    }

    public boolean isAmpliFourni() {
        return ampliFourni;
    }

    public boolean isPedaleFournie() {
        return pedaleFournie;
    }

    public void setAmpliFourni(boolean ampliFourni) {
        this.ampliFourni = ampliFourni;
    }

    public void setPedaleFournie(boolean pedaleFournie) {
        this.pedaleFournie = pedaleFournie;
    }

    @Override
    public String ficheTechnique() {
        return this.nom + " : \n" + "Dimensions : " + this.longueur + " x " + this.largeur + "\nPédale fournie : " + (this.pedaleFournie ? "✓" : "𐄂") + "\nAmpli fourni: " + (this.ampliFourni ?"✓" : "𐄂") +"\nPrix achat : " + this.prixAchat + "\nPrix vente : "+this.prixVente;
    }
}
