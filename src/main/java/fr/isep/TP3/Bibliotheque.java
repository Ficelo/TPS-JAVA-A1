package fr.isep.TP3;

public class Bibliotheque {
    public static void main(String[] args) {

        // Exercice 1 : Question 2
        Document documentTest = new Document(0, "document titre");
        Dictionnaire dicoTest = new Dictionnaire(1, "dictionnaire test", "fr", 3);
        Livre livreTest = new Livre(2, "livre test", "Auteur auterman", 200);

        // Exercice 1 : Question 3
        ListeDeDocuments liste = new ListeDeDocuments();
        liste.addDocument(documentTest);
        liste.addDocument(dicoTest);
        liste.addDocument(livreTest);
        // Exercice 1 : Question 6
        liste.tousLesAuteurs();
        liste.tousLesDocuments();

        // Exercice 2 : tests

        Figure fig = new Figure();
        Figure fig1 = new Figure();
        Carre carre = new Carre(1, 1, 3, 4);
        Rectangle rectangle = new Rectangle(1, 1, 3, 4, 5);

        System.out.println(Figure.getInstances());
        System.out.println(Carre.getInstances());



    }
}