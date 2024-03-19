package fr.isep.TP4.exo1;

class Rectangle extends Figure {
    private int longueur;
    private int largeur;

    public Rectangle(int abscisse, int ordonnee, int couleur, int longueur, int largeur) {
        super(abscisse, ordonnee, couleur);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Setters
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    // Getters

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }
}

