package fr.isep.TP5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Partie2 {

    public static void main(String[] args) throws IOException {

        // EXO 1

        StringBuilder stringBuilder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File("/Users/teiva/IdeaProjects/TPS-JAVA/05d_Lorem_ipsum.txt"));

            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
        } catch (Exception err){
            System.out.println(err.toString());
        }

        String[] data = stringBuilder.toString().split("\n");
        String[][] texte = new String[data.length][];
        for(int i=0; i<data.length; i++){
            texte[i] = data[i].split(" ");
        }
        //System.out.println(Arrays.deepToString(texte));

        System.out.println("Nombre de mots dans le ficher : " + countWords(stringBuilder.toString()));

        writeToFile(texte);

    }

    // EXO 2
    public static int countWords(String texte){
        String[] data = texte.toString().split(" ");
        return data.length;
    }

    public static void writeToFile(String[][] texte) throws IOException {
        FileWriter fileWriter = new FileWriter("Output.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (String[] strings : texte) {
            printWriter.print((strings.length -1) + "\n"); // Le -1 c'est pour pas compter les "\n"
        }
        printWriter.close();
    }

}
