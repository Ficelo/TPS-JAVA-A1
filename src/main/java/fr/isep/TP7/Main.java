package fr.isep.TP7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    static String[] eleves = {"Thancred", "Y'shtola", "Alphinaud", "Alisaie", "Estinian"};
    static LinkedList<Block> blockChain;
    static HashMap<String, Wallet> dictionnaire;

    public static void main(String[] args){

        dictionnaire = creerDictionnaire(eleves);

        blockChain = new LinkedList<Block>();
        blockChain.add(new Block());

        simulation(55);
        //System.out.println(blockChain);

        HashMap<String, Integer> dicoHistorique = genereDicoHistorique();
        System.out.println(dicoHistorique);

    }

    public static HashMap<String, Wallet> creerDictionnaire(String[] eleves){

        HashMap<String, Wallet> dictionnaire = new HashMap<>();
        Random random = new Random();
        int token = random.nextInt(1, 1000000);

        for(String eleve : eleves){
            dictionnaire.put(eleve, new Wallet(eleve, token, 10));
        }

        return dictionnaire;
    }

    public static void simulation(int numTransactions){
        Random random = new Random();
        for (int i=0; i<numTransactions; i++){
            int origin = random.nextInt(0, eleves.length );
            int destination = random.nextInt(0, eleves.length );
            blockChain.getLast().add(new Transaction(dictionnaire.get(eleves[origin]), dictionnaire.get(eleves[destination]), 1, false), blockChain);
        }

    }

    public static HashMap<String, Integer> genereDicoHistorique() {

        HashMap<String, Integer> dico = new HashMap<String, Integer>();

        for(int i = 0; i<eleves.length; i++){
            dico.put(eleves[i], 0);
        }

        for(Block block : blockChain){
            for(Transaction transaction : block.getTransactions()){
                dico.put(transaction.getOriginWallet().getOwner(), dico.get(transaction.getOriginWallet().getOwner()) + 1 );
                dico.put(transaction.getDestinationWallet().getOwner(), dico.get(transaction.getDestinationWallet().getOwner()) + 1 );
            }
        }

        return dico;
    }

}
