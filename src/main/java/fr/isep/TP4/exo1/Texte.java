package fr.isep.TP4.exo1;

class Texte implements Dessinable {
    private String contenu;
    private int couleur;

    public Texte(String contenu, int couleur) {
        this.contenu = contenu;
        this.couleur = couleur;
    }

    @Override
    public void afficher() {
        // Implémentation de l'affichage du texte
        System.out.println("Texte affiché: " + contenu);
    }

    public String getContenu() {
        return contenu;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}
