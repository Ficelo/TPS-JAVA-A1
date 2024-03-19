package fr.isep.TP4.exo2;

import java.util.ArrayList;
import java.util.Iterator;

public class Magasin {
    private ArrayList<Instrument> stock = new ArrayList<Instrument>();
    private int montantLoyer;
    private int tresorerie;

    public Magasin(int montantLoyer, int tresorerie) {
        this.montantLoyer = montantLoyer;
        this.tresorerie = tresorerie;
    }

    public Magasin(ArrayList<Instrument> stock, int montantLoyer, int tresorerie) {
        this.stock = stock;
        this.montantLoyer = montantLoyer;
        this.tresorerie = tresorerie;
    }

    public void fournir(Instrument instrument, int quantite){

        if(quantite * instrument.getPrixAchat() > tresorerie){
            System.out.println("Y'a pas les thunes");
        } else {
            for(int i=0; i<quantite; i++){
                stock.add(instrument);
            }
            tresorerie -= quantite * instrument.getPrixAchat();
        }

        System.out.println(stock);
        System.out.println(tresorerie);
    }

    public void vendre(Instrument instrument, int quantite){

        int stockInstru = 0;
        int prix = 0;

        for(Instrument instru: stock){
            if(instru.getClass().isInstance(instrument)){
                stockInstru++;
                prix =instru.getPrixVente();
            }
        }

        if(quantite > stockInstru){
            System.out.println("Y'a pas assez de stock");
        } else {
            Iterator<Instrument> iterator = stock.iterator();
            while (iterator.hasNext()) {
                Instrument instru = iterator.next();
                if (instru.getClass().isInstance(instrument) && stockInstru > 1) {
                    iterator.remove(); // Remove the current element using the iterator
                    stockInstru--;
                }
            }
            tresorerie += quantite * prix;
        }

        System.out.println(stock);
        System.out.println(tresorerie);

    }

    public int getMontantLoyer() {
        return montantLoyer;
    }

    public void setMontantLoyer(int montantLoyer) {
        this.montantLoyer = montantLoyer;
    }

    public int getTresorerie() {
        return tresorerie;
    }

    public void setTresorerie(int tresorerie) {
        this.tresorerie = tresorerie;
    }

    public ArrayList<Instrument> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Instrument> stock) {
        this.stock = stock;
    }
}
