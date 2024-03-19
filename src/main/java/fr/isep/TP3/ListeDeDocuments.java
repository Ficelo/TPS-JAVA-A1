package fr.isep.TP3;

public class ListeDeDocuments {

    private Document[] liste; // Ça serait quand même grave moins pénible de faire avec une List
    private int taille;

    public ListeDeDocuments(){
        this.liste = new Document[10];
        this.taille = 0;
    }

    public void addDocument(Document document){
        if (taille < liste.length) {
            this.liste[taille++] = document;
        } else {
            System.out.println("Y'a plus de place");
        }
    }

    // Exercice 1 : Question 4

    public void tousLesAuteurs(){
        for(int i = 0; i<liste.length; i++){
            if(liste[i] instanceof Livre){
                System.out.print("Numero : " + liste[i].getNumeroEnregistrement() + " Auteur : " + (((Livre) liste[i]).getAuteur() + "\n"));
            }
            else if (liste[i] != null){
                System.out.println("Numero : " + liste[i].getNumeroEnregistrement());
            }
        }
    }

    public void tousLesDocuments(){
        for(int i = 0; i<liste.length; i++){
            if(liste[i]!= null){
                System.out.println(liste[i].toString());
            }

        }
    }

}
