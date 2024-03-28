package fr.isep.TP6;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class TriSelection {

    public static void main(String[] args){

        int[] test = generateTableauTest(30);
        System.out.println(Arrays.toString(trier(test)));

    }

    public static int[] trier(int[] tab){
        Instant start = Instant.now();
        for(int i = 0; i<tab.length; i++){
            int ind = indiceMin(tab, i, tab.length);
            int old = tab[i];
            tab[i] = tab[ind];
            tab[ind] = old;
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri selction à pris " + duration + " ms");
        return tab;
    }

    public static int indiceMin(int[] tab, int i, int n){
        int min = tab[i];
        int index = i;
        for(int j = i; j<n; j++) {
            if (tab[j] <= min) {
                min = tab[j];
                index = j;
            }
        }
        return index;
    }

    public static int[] generateTableauTest(int taille){
        Instant start = Instant.now();
        int[] tab = new int[taille];
        Random random = new Random();
        for(int i=0; i<taille; i++){
            tab[i] = random.nextInt(1, taille);
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’initialisation a pris " + duration + " ms");
        return tab;
    }

}
