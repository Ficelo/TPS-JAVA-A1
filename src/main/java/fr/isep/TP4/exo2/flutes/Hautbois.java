package fr.isep.TP4.exo2.flutes;

import fr.isep.TP4.exo2.Instrument;
import fr.isep.TP4.exo2.InstrumentVent;

public class Hautbois extends InstrumentVent implements Instrument {

    private boolean gereTrille;
    private int qualiteAcoustique;

    public Hautbois(){}

    public Hautbois(boolean gereTrille, int qualiteAcoustique, int type, int prixAchat, int prixVente) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.type = type;
        this.gereTrille = gereTrille;
        this.qualiteAcoustique = qualiteAcoustique;
        this.setNom("Hautbois");
    }

    public boolean isGereTrille() {
        return gereTrille;
    }

    public void setGereTrille(boolean gereTrille) {
        this.gereTrille = gereTrille;
    }

    public int getQualiteAcoustique() {
        return qualiteAcoustique;
    }

    public void setQualiteAcoustique(int qualiteAcoustique) {
        this.qualiteAcoustique = qualiteAcoustique;
    }

    @Override
    public String ficheTechnique() {
        return this.nom + "\n Type : " + this.type + "\nTrille : " + (this.gereTrille ? "✓" : "𐄂") + "\nQualité acoustique :" + this.qualiteAcoustique +"\nPrix achat : " + this.prixAchat + "\nPrix vente : "+this.prixVente;
    }

}
