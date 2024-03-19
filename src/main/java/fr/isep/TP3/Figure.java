package fr.isep.TP3;

import java.util.Vector;

public class Figure {

    protected int abscisse;
    protected int ordonnee;
    protected int couleur;

    // Exercice 2 : Question 3
    private static Vector<Figure> vecteur = new Vector<Figure>();

    public Figure(){
        vecteur.add(this);
    }

    public Figure(int ab, int or, int couleur){
        this.abscisse = ab;
        this.ordonnee = or;
        this.couleur = couleur;
        vecteur.add(this);
    }

    public static Vector<Figure> getInstances(){
        return vecteur;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public int getCouleur() {
        return couleur;
    }
}
