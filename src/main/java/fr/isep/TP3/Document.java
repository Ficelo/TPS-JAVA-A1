package fr.isep.TP3;

public class Document {

    protected int numeroEnregistrement;
    protected String titre;

    public Document(int num, String titre){
        this.numeroEnregistrement = num;
        this.titre = titre;
    }

    public Document() {

    }

    // Exercice 1 : Question 5
    @Override
    public String toString() {
       return "Numéro enregistrement : " + numeroEnregistrement + " | Titre : " + titre;
    }

    // Setters

    public void setNumeroEnregistrement(int numeroEnregistrement) {
        this.numeroEnregistrement = numeroEnregistrement;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    // Getters

    public int getNumeroEnregistrement() {
        return numeroEnregistrement;
    }

    public String getTitre() {
        return titre;
    }

}
