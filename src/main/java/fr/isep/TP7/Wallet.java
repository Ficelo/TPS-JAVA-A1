package fr.isep.TP7;

public class Wallet {

    private String owner;
    private int token;
    private int isepCoins = 0;

    public Wallet(){}

    public Wallet(String owner, int token, int isepCoins){
        this.owner = owner;
        this.token = token;
        this.isepCoins = isepCoins;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "owner='" + owner + '\'' +
                ", token=" + token +
                ", isepCoins=" + isepCoins +
                '}';
    }

    // Getters

    public String getOwner() {
        return owner;
    }

    public int getToken() {
        return token;
    }

    public int getIsepCoins() {
        return isepCoins;
    }

    // Setters

    public void setIsepCoins(int isepCoins) {
        this.isepCoins = isepCoins;
    }
}
