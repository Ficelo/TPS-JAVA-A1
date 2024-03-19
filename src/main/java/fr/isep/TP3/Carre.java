package fr.isep.TP3;

import java.util.Vector;

public class Carre extends Figure {

    private int longueur;

    public Carre(int ab, int or, int couleur, int longueur){
        super();
        this.abscisse = ab;
        this.ordonnee = or;
        this.couleur = couleur;
        this.longueur = longueur;
    }

    public static Vector<Figure> getInstances(){
        Vector<Figure> vecteur = Figure.getInstances();
        Vector<Figure> newVecteur = new Vector<Figure>();

        for(int i = 0; i < vecteur.size(); i++){
            if(vecteur.get(i) instanceof Carre){
                newVecteur.add(vecteur.get(i));
            }
        }

        return newVecteur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
}
