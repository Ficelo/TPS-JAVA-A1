package fr.isep.TP1;

import java.util.Scanner;

public class EXO41 {

    public static void main(String[] args) {
        System.out.println("Bonjour, quel est votre prénom ?");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Bonjour " + name);
    }

}
