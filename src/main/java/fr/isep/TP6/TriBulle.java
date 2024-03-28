package fr.isep.TP6;

import java.time.Duration;
import java.time.Instant;

public class TriBulle {

    public static void trier(int[] tableau){
        Instant start = Instant.now();
        for(int i = tableau.length -1; i>1 ;i--){
            for(int j = 0; j<i-1; j++){
                if(tableau[j+1] < tableau[j]) TriInsertion.permuter(tableau, j, j+1);
            }
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri à bulle à pris " + duration + " ms");
    }

}
