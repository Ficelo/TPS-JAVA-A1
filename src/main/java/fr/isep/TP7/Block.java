package fr.isep.TP7;

import java.util.LinkedList;
import java.util.Stack;

public class Block {

    private Stack<Transaction> transactions = new Stack<Transaction>();

    public Block() {
    }

    public Block(Stack<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Block add(Transaction transaction, LinkedList<Block> blockchain){

        transactions.add(transaction);

        if(transactions.size() >= 10) {
            for (Transaction t : transactions){
                t.pay();
            }
            blockchain.add(new Block());
        }

        return this;
    }

    @Override
    public String toString() {
        return "Block{" +
                "transactions=" + transactions +
                "} \n";
    }

    public Stack<Transaction> getTransactions() {
        return transactions;
    }
}
