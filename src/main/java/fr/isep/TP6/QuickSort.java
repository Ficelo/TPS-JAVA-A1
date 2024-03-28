package fr.isep.TP6;

import java.time.Duration;
import java.time.Instant;

public class QuickSort {


    public static void trier(int[] tableau, int g, int d){
        Instant start = Instant.now();
        triRapide(tableau, g, d);
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri quick sort à pris " + duration + " ms");
    }

    public static void triRapide(int[] tableau, int g, int d){
        if(g < d){
            int m = (g + d)/2;
            triRapide(tableau, g, m - 1);
            triRapide(tableau, m+1, d);
        }
    }

}
