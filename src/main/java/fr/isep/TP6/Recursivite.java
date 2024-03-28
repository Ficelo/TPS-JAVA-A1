package fr.isep.TP6;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Recursivite {

    public static int SIZE = Integer.MAX_VALUE / 10000;
    //public static int SIZE = 20;

    public static void main(String[] args){
        int[] bigTableau = TriSelection.generateTableauTest(SIZE);
        int[] tableauSelection = new int[SIZE];
        int[] tableauInsertion = new int[SIZE];
        int[] tableauQuickSort = new int[SIZE];
        int[] tableauBulle = new int[SIZE];

        Instant start = Instant.now();
        Arrays.sort(bigTableau);
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Le tri de java à pris " + duration + " ms");

        System.arraycopy(bigTableau, 0, tableauSelection, 0, SIZE);
        System.arraycopy(bigTableau, 0, tableauInsertion, 0, SIZE);
        System.arraycopy(bigTableau, 0, tableauQuickSort, 0, SIZE);
        System.arraycopy(bigTableau, 0, tableauBulle, 0, SIZE);

        TriSelection.trier(tableauSelection);
        TriInsertion.trier(tableauInsertion);
        QuickSort.trier(tableauQuickSort, 0, tableauQuickSort.length - 1);
        TriBulle.trier(tableauBulle);

        System.out.println("Tableaux triés :");
        System.out.println("Selection : " + (Arrays.equals(tableauSelection, bigTableau) ? "✓" : "𐄂"));
        //System.out.println(Arrays.toString(tableauSelection));
        System.out.println("Insertion : " + (Arrays.equals(tableauInsertion, bigTableau) ? "✓" : "𐄂"));
        //System.out.println(Arrays.toString(tableauInsertion));
        System.out.println("Quick sort : " + (Arrays.equals(tableauQuickSort, bigTableau) ? "✓" : "𐄂"));
        //System.out.println(Arrays.toString(tableauQuickSort));
        System.out.println("Tri à bulle : " + (Arrays.equals(tableauBulle, bigTableau) ? "✓" : "𐄂"));

    }

    public static int fib(int n){
        if(n > 2) return fib(n -1) + fib(n-2);
        return 0;
    }


}
