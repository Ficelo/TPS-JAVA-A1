package fr.isep.TP4.exo1;

class Carre extends Figure {
    private int longueurCote;

    public Carre(int abscisse, int ordonnee, int couleur, int longueurCote) {
        super(abscisse, ordonnee, couleur);
        this.longueurCote = longueurCote;
    }

    public int getLongueurCote() {
        return longueurCote;
    }

    public void setLongueurCote(int longueurCote) {
        this.longueurCote = longueurCote;
    }

}
