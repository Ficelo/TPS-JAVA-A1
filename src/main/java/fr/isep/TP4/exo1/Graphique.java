package fr.isep.TP4.exo1;

class Graphique {
    public static void afficherTableauDessinables(Dessinable[] dessinables) {
        for (Dessinable dessinable : dessinables) {
            dessinable.afficher();
        }
    }
}
