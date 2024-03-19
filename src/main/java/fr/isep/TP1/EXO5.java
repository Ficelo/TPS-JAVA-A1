package fr.isep.TP1;

import java.util.Scanner;

public class EXO5 {

    public static void main(String[] args) {

        //somme();
        //division();
        volume();

    }

    // Exercice 5.1
    public static void somme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier entier :");
        int firstNumber = scanner.nextInt();
        System.out.println("Entrez le deuxième entier: ");
        int secondNumber = scanner.nextInt();

        int somme = firstNumber + secondNumber;
        System.out.println("La somme de " + firstNumber + " et " + secondNumber + " est : " + somme);
    }

    // Exercice 5.2
    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier entier :");
        float firstNumber = scanner.nextFloat();
        System.out.println("Entrez le deuxième entier: ");
        float secondNumber = scanner.nextFloat();

        float divison = firstNumber / secondNumber;
        System.out.println("La somme de " + firstNumber + " et " + secondNumber + " est : " + divison);
    }

    // Exercice 5.3

    // 1. Techniquement que 3 mais c'est plus lisible avec 4
    // 2. Y'a que des floats c'est pas spécifié si les dimensions c'est des entiers
    // 3. Ben on fait la formule c'est quoi cette question de golmon frr
    // 4. (longueur * largeur) * hauteur
    // 5. Ben jsp on l'affiche on va pas se le foutre dans le cul

    public static void volume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la longueur :");
        float longueur = scanner.nextFloat();
        System.out.println("Entrez la largeur: ");
        float largeur = scanner.nextFloat();
        System.out.println("Entrez la hauteur: ");
        float hauteur = scanner.nextFloat();

        float volume = (longueur * largeur) * hauteur;

        System.out.println("Le volume est : " + volume);

        System.out.println(" ".repeat((int) largeur) + "*".repeat((int) longueur));
        for(int i = (int) largeur - 2; i > 0; i--){
            System.out.println(" ".repeat((int) i) + "*" + " ".repeat((int) longueur - 1) + "*" + ".".repeat((int) largeur-1 - (int) i));
        }
        System.out.println("*".repeat((int) longueur + 1) + ".".repeat((int) largeur - 1) + " ".repeat(10) + "Le volume est : " + volume);
        for(int i = (int) hauteur; i>0; i--){
            if (i > (int) largeur){
                System.out.println("*" + " ".repeat((int) longueur - 1) + "*" + ".".repeat((int) largeur-1));
            }
            else if (i - 1 != 0){
                System.out.println("*" + " ".repeat((int) longueur - 1) + "*" + ".".repeat(i - 1));
            }
            else {
                System.out.println("*".repeat((int) longueur + 1));
            }
        }

    }

}
