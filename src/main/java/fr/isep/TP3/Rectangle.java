package fr.isep.TP3;

import java.util.Vector;

public class Rectangle extends  Figure{

    private int longueur;
    private int largeur;

    public Rectangle(int ab, int or, int couleur, int longueur, int largeur){
        super();
        this.abscisse = ab;
        this.ordonnee = or;
        this.couleur = couleur;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public static Vector<Figure> getInstances(){
        Vector<Figure> vecteur = Figure.getInstances();
        Vector<Figure> newVecteur = new Vector<Figure>();

        for(int i = 0; i < vecteur.size(); i++){
            if(vecteur.get(i) instanceof Rectangle){
                newVecteur.add(vecteur.get(i));
            }
        }

        return newVecteur;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}
