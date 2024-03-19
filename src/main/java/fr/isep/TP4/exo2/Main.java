package fr.isep.TP4.exo2;

import fr.isep.TP4.exo2.guitares.GuitareAcoustique;

public class Main {

    public static void main(String[] args){


        Magasin magasin = new Magasin(100, 10000);
        magasin.fournir(new GuitareAcoustique(GuitareAcoustique.DROITIER, 2, 5, 10, 25, 40), 4);
        magasin.vendre(new GuitareAcoustique(), 3);

        for(Instrument instrument : magasin.getStock()){
            System.out.println(instrument.ficheTechnique());
        }
    }

}
