package fr.isep.TP7;

public class Transaction {

    private Wallet originWallet;
    private Wallet destinationWallet;

    private int isepCoins;
    private boolean payed;

    public Transaction(){}

    public Transaction(Wallet originWallet, Wallet destinationWallet, int isepCoins, boolean payed) {
        this.originWallet = originWallet;
        this.destinationWallet = destinationWallet;
        this.isepCoins = isepCoins;
        this.payed = payed;
    }

    public void pay(){

        if(originWallet == destinationWallet) return;

        if(originWallet.getIsepCoins() - isepCoins < 0){
            System.out.println("Transaction refusée");
        }
        else {
            originWallet.setIsepCoins(originWallet.getIsepCoins() - isepCoins);
            destinationWallet.setIsepCoins(destinationWallet.getIsepCoins() + isepCoins);
            this.payed = true;
        }

    }

    @Override
    public String toString() {
        return "Transaction{" +
                "originWallet=" + originWallet +
                ", destinationWallet=" + destinationWallet +
                ", isepCoins=" + isepCoins +
                ", payed=" + payed +
                '}';
    }

    // GETTERS

    public Wallet getOriginWallet() {
        return originWallet;
    }

    public Wallet getDestinationWallet() {
        return destinationWallet;
    }

    public int getIsepCoins() {
        return isepCoins;
    }

    public boolean isPayed() {
        return payed;
    }
}
