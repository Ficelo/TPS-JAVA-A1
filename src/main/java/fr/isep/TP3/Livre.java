package fr.isep.TP3;

public class Livre extends Document{

    private String auteur;
    private int nombrePages;

    public Livre(int num, String titre, String auteur, int nombrePages){
        this.numeroEnregistrement = num;
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }

    // Exercice 1 : Question 5
    @Override
    public String toString() {
        return super.toString() + " | Auteur : " + auteur + " | Nombre de pages : " + nombrePages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }
}
