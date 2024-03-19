package fr.isep.TP2;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Quel exercice? saisissez :");
        System.out.println("1. Discriminant\n" +
                "2. Parité d’un nombre\n" +
                "3. Calcul d’extremum\n" +
                "4. Égalité entre chaînes de caractères\n" +
                "5. Factorielle\n" +
                "6. Compte à rebous\n" +
                "7. Valeurs de carrés\n" +
                "8. Table de multiplication\n" +
                "9. Division d’entiers\n" +
                "10. Règle graduée\n" +
                "11. Nombres premiers\n" +
                "12. Manipulations sur un tableau");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
        } while(choice < 0 || choice > 12);

        switch (choice){
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                max();
                min();
                break;
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carre();
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                premier();
                break;
            case 12:
                initialisationTableau();
                break;
        }

    }

    // 3.1.1
    public static void discriminant() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle : delta = " + delta);
        } else if(delta == 0) {
            int x0 = (-b / (2*a)); // Faudrait rajouter un truc au cas où y'a une divisoin par 0
            System.out.println("La raçine de ce polynome est : " + x0);
        } else {
            double x0 = (-b + Math.sqrt(delta))/(2*a);
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Les raçines de ce polynome sont : " + x0 + " et " + x1);
        }

    }

    // 3.1.2
    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saissez un entier :");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Le nombre " + number + " est pair");
        } else {
            System.out.println("Le nombre "  + number + " est imppair");
        }

    }

    // 3.1.3
    public static void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saissez le premier entier :");
        int number1 = scanner.nextInt();
        System.out.println("Saissez le deuxième entier :");
        int number2 = scanner.nextInt();

        if(number1 < number2) {
            System.out.println("Le nombre maximum est : " + number2);
        } else {
            System.out.println("Le nombre maximum est : " + number1);
        }
    }

    public static void min(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saissez le premier entier :");
        int number1 = scanner.nextInt();
        System.out.println("Saissez le deuxième entier :");
        int number2 = scanner.nextInt();

        if(number1 > number2) {
            System.out.println("Le nombre minimum est : " + number2);
        } else {
            System.out.println("Le nombre minimum est : " + number1);
        }
    }

    // 3.1.4
    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saissez la première chaine de charactères :");
        String string1 = scanner.next();
        System.out.println("Saissez la deuxième chaine de charactères :");
        String string2 = scanner.next();

        if(string1.equals(string2)){
            System.out.println("Les deux chaines sont les mêmes");
        } else {
            System.out.println("Les deux chaines sont différentes");
        }
    }

    // 3.2
    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = n; i > 0; i--) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    // 3.2.1
    public static void countdown(){
        for(int i = 10; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("BOOM!");
    }

    // 3.2.2
    public static void carre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier : ");
        int a = scanner.nextInt();
        System.out.println(a + "\t" + (a*a));
    }

    // 3.2.3
    public static void tableMultiplication(){
        for(int i=1; i <= 10; i++){
            for(int y=1; y <= 10; y++){
                System.out.print(i * y + "\t");
            }
            System.out.print("\n");
        }
    }

    // 3.2.5
   public static void division(){
       Scanner scanner = new Scanner(System.in);
       int denominateur;
       int nominateur;

       System.out.println("Veuillez saisir un entier comme nominateur");
       nominateur = scanner.nextInt();

       do {
           System.out.println("Veuillez saisir un entier positif ou nul comme dénomiateur");
           denominateur = scanner.nextInt();
       } while (denominateur <= 0);

       float res = (float) nominateur/ (float) denominateur; // Sinon ça fait pas les virgules

       System.out.println(nominateur + " / " + denominateur + " = " + res);
   }

   // 3.3.1
    public static void regle(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Veuillez saisir un entier positif ou nul");
            number = scanner.nextInt();
        } while (number <= 0);
        for(int i = 0; i< number+1; i++){
            if (i% 10 == 0){
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
    }

    // 3.3.2

    public static void premier(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Veuillez saisir un entier positif ou nul");
            number = scanner.nextInt();
        } while (number <= 0);
        for(int i = 2; i<number; i++){
            if (number%i == 0) {
                System.out.println("Ce nombre n'est pas un nombre premier");
                return;
            }
        }
        System.out.println("Ce nombre est un nombre premier");
    }

    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        // max
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (max < tableau[i]){
                max = tableau[i];
            }
        }
        // min
        int min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (min > tableau[i]){
                min = tableau[i];
            }
        }

        System.out.println("Le max du tableau est : " + max + " Le min est : " + min);

        // Somme
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        System.out.println("La somme de tous les éléments du tableau est : " + somme);

        // Pairs
        String pairs = "Les éléments du tableau pairs sont : ";
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i]%2 == 0){
                pairs += tableau[i] + " ";
            }
        }
        System.out.println(pairs);
        inverseTableau(tableau);


    }

    public static void inverseTableau(int[] tableau){
        int[] tableauInverse = new int[tableau.length];
        for (int i=0; i<tableau.length; i++){
            tableauInverse[tableau.length - i - 1] = tableau[i];
        }
        System.out.print("L'inverse du tableau est : "+ Arrays.toString(tableauInverse));
    }
}