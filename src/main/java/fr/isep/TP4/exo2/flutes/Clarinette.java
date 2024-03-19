package fr.isep.TP4.exo2.flutes;

import fr.isep.TP4.exo2.Instrument;
import fr.isep.TP4.exo2.InstrumentVent;

public class Clarinette extends InstrumentVent implements Instrument {

    private int usageAdapte;
    public static final int CHAMBRE = 0;
    public static final int SYMPHONIQUE = 1;
    public static final int HARMONIQUE = 2;
    private final String[] usage = {"Chambre", "Symphonique", "Harmonique"};

    public Clarinette(){}

    public Clarinette(int usageAdapte, int type, int prixAchat, int prixVente) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.type = type;
        this.usageAdapte = usageAdapte;
        this.setNom("Clarinette");
    }

    public int getUsageAdapte() {
        return usageAdapte;
    }

    public void setUsageAdapte(int usageAdapte) {
        this.usageAdapte = usageAdapte;
    }


    @Override
    public String ficheTechnique() {
        return this.nom + " : \nType : " + this.type + "\nUsage adapté : " + this.usage[this.usageAdapte] +"\nPrix achat : " + this.prixAchat + "\nPrix vente : "+this.prixVente;
    }
}
