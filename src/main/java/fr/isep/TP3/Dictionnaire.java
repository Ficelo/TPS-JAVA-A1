package fr.isep.TP3;

public class Dictionnaire extends Document {

    private String langue;
    private int nombreTomes;

    public Dictionnaire(int num, String titre, String langue, int nombreTomes){
        this.numeroEnregistrement = num;
        this.titre = titre;
        this.langue = langue;
        this.nombreTomes = nombreTomes;
    }

    // Exercice 1 : Question 5
    @Override
    public String toString() {
        return super.toString() + " | Langue : " + this.langue + " | Nombre de tomes : " + this.nombreTomes;
    }

    public String getLangue() {
        return langue;
    }

    public int getNombreTomes() {
        return nombreTomes;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public void setNombreTomes(int nombreTomes) {
        this.nombreTomes = nombreTomes;
    }
}
