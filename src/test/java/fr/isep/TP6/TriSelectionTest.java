package fr.isep.TP6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TriSelectionTest {

    @Test
    public void trier() {

        int[] tableau = TriSelection.generateTableauTest(30);
        TriSelection.trier(tableau);
        assertEquals(30, tableau.length);
        verifierTableau(tableau);


    }

    private void verifierTableau(int[] tab) {
        assertTrue("A sort needs two items minimum", tab.length >= 2);
        for (int i = 0; i < tab.length - 2; i++) {
            assertTrue(tab[i] + "<" + tab[i + 1] + " is false. Indexes are " + i + " and " + (i - 1), tab[i] <= tab[i + 1]);
        }
    }

}