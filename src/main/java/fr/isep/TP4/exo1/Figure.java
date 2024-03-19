package fr.isep.TP4.exo1;

class Figure implements Dessinable, Deplaceable {
    private int abscisse;
    private int ordonnee;
    private int couleur;

    public Figure(int abscisse, int ordonnee, int couleur) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.couleur = couleur;
    }

    @Override
    public void afficher() {
        // Implémentation de l'affichage
        System.out.println("Figure affichée");
    }

    @Override
    public void deplacer(int nouvelleAbscisse, int nouvelleOrdonnee) {
        // Implémentation du déplacement
        this.abscisse = nouvelleAbscisse;
        this.ordonnee = nouvelleOrdonnee;
        System.out.println("Figure déplacée à (" + nouvelleAbscisse + ", " + nouvelleOrdonnee + ")");
    }

    // Getters

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public int getCouleur() {
        return couleur;
    }

    // Setters

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}
