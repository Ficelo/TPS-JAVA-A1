package fr.isep.TP4.exo2;

public class InstrumentVent{

    protected int type;
    protected String nom = "";
    protected int prixAchat;
    protected int prixVente;

    public final int BISEAU = 0;
    public final int ANCHE_SIMPLE = 1;
    public final int ANCHE_DOUBLE = 2;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    public int getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(int prixVente) {
        this.prixVente = prixVente;
    }
}
