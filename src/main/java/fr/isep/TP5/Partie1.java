package fr.isep.TP5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Partie1 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/teiva/IdeaProjects/TPS-JAVA/dpt2018.csv"));
        StringBuilder stringBuilder = new StringBuilder();
        scanner.nextLine(); // skip la première ligne ?
        while(scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine()).append("\n");
        }
        scanner.close();

        String data = stringBuilder.toString();
        String[] lines = data.split("\n");
        System.out.println("Nombre de lignes totales : " + lines.length);

        // EXO 4.1

        Pattern pattern1 = Pattern.compile("XXXX");
        Pattern pattern2 = Pattern.compile("XX");

        int nombreLignesIncompletes = 0;
        int prenomsMasculins = 0;
        int prenomsFeminins = 0;
        int naissances2016 = 0;
        //HashMap<String, Integer> prenoms = new HashMap<>();
        HashMap<String, Integer> prenomsM = new HashMap<>();
        HashMap<String,Integer> listeCamilleHomme = new HashMap<>();
        HashMap<String,Integer> listeCamilleFemme = new HashMap<>();
        ArrayList<Integer> moynenneJEAN = new ArrayList<Integer>();
        ArrayList<Integer> moynenneMARIE = new ArrayList<Integer>();


        for(int i=0; i<lines.length; i++){

            Matcher matcher1 = pattern1.matcher(lines[2]);
            Matcher matcher2 = pattern2.matcher(lines[i]);



            // Lignes incomplètes (4.1.2)
            if(matcher1.find()){
                nombreLignesIncompletes++;
                lines[i] = lines[i].replace("XXXX", "-1");
            }
            if (matcher2.find()) {
                lines[i] = lines[i].replace("XX", "-1");
                nombreLignesIncompletes++;
            }
            String[] ligne = lines[i].split(";");

            // Nombre prénoms masculins / féminins (4.1.3)
            if(ligne[0].equals("1")) prenomsMasculins++;
            if(ligne[0].equals("2")) prenomsFeminins++;

            // 4.1.4

            if(ligne[0].equals("1")) prenomsM.merge(ligne[1], Integer.parseInt(ligne[4]), Integer::sum);

            // 4.1.5
            if(ligne[2].equals("2016") && ligne[3].equals("75")) naissances2016 += Integer.parseInt(ligne[4]);

            // 4.1.6
            if(ligne[0].equals("1") && ligne[1].equals("JEAN")) moynenneJEAN.add(Integer.parseInt(ligne[4]));

            // 4.1.7
            if(ligne[0].equals("2") && ligne[1].equals("MARIE")) moynenneMARIE.add(Integer.parseInt(ligne[4]));

            // 4.1.8
            if(ligne[0].equals("1") && ligne[1].equals("CAMILLE")) listeCamilleHomme.put(ligne[2], Integer.parseInt(ligne[4]));
            if(ligne[0].equals("2") && ligne[1].equals("CAMILLE")) listeCamilleFemme.put(ligne[2], Integer.parseInt(ligne[4]));
        }

        int totalJean = 0;
        for(int jean : moynenneJEAN) totalJean += jean;
        int totalMarie = 0;
        for(int marie : moynenneMARIE) totalMarie += marie;

        System.out.println("Nombre de lignes incomplètes : " + nombreLignesIncompletes);
        System.out.println("Nombre de prenoms masculins : " + prenomsMasculins + " | Nombre prénoms féminins : " + prenomsFeminins);

        System.out.println("AVEC CHECK MASCULIN : ");
        System.out.println("Nombre de THIBAUT : " + prenomsM.get("THIBAUT"));
        System.out.println("Nombre de CLAUDE : " + prenomsM.get("CLAUDE"));
        System.out.println("Nombre de JÉRÔME : " + prenomsM.get("JÉRÔME"));
        System.out.println("Nombre de HERVÉ, : " + prenomsM.get("HERVÉ,"));
        System.out.println("Nombre de PATRICK : " + prenomsM.get("PATRICK"));
        System.out.println("Nombre de GUILLAUME : " + prenomsM.get("GUILLAUME"));

        System.out.println("Nombre de naissances en 2016 à Paris: " + naissances2016);

        System.out.println("Moyenne de Jean : " + (totalJean / moynenneJEAN.size()));
        System.out.println("Moyenne de Marie : " + (totalMarie / moynenneMARIE.size()));

        for(Map.Entry<String, Integer> map : listeCamilleHomme.entrySet()){
            if(map.getValue() != null){
                if(map.getValue() < listeCamilleFemme.get(map.getKey())){
                    System.out.println("L'année où la situation c'est renversée est : " + map.getKey());
                    return;
                }
            }
        }

    }
}