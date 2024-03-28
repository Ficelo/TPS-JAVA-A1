package fr.isep.TP6;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class TriInsertion {

    public static void main(String[] args){
        int[] test = TriSelection.generateTableauTest(30);
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(trier(test)));
    }

    public static int[] trier(int[] tab){
        Instant start = Instant.now();
        for(int i=0; i<tab.length; i++){
            int j = i;
            while(j>=1 && tab[j] < tab[j - 1]) {
                permuter(tab, j, j-1);
                j--;
            }
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri insertion à pris " + duration + " ms");
        return tab;
    }

    public static int[] permuter(int[] tab, int i, int j){

        int stockage = tab[i];
        tab[i] = tab[j];
        tab[j] = stockage;

        return tab;
    }

}
