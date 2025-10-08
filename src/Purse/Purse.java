package Purse;

import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins;
    private double balance;

    public Purse() {
        coins = new ArrayList<>();
    }

    public void addCoin(Coin coin) {
        coins.add(coin);
    }

    public double getBalance() {
        return balance;
    }

    public boolean removeCoin(Coin coin) {
        int index = find(coin);
        if (index == -1) {
            return false;
        }
        coins.remove(index);
        return true;
    }

    public int count(){
        return coins.size();
    }

    public double getTotal() {
        double total = 0;
        for (Coin coin : coins) {
            total+= coin.getValore();
        }
        return total;
    }

    public Coin getMax(){
        if (coins.isEmpty()) return null; //avremmo potuto usare anche if (coins.size() == 0)
        Coin max = coins.get(0);
        for (Coin coin : coins) {
            if (coin.getValore() > max.getValore()) {
                max = coin;
            }
        }
        return max;
    }

    public Coin getMin(){
        if (coins.isEmpty()) return null;
        Coin min = coins.get(0);
        for (Coin coin : coins) {
            if (coin.getValore() < min.getValore()) {
                min = coin;
            }
        }
        return min;
    }

    public int find(Coin coin){
        for(int i = 0; i < coins.size(); i++){
            if(coins.get(i).getValore() == coin.getValore()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Purse: " + coins.toString() + "| Totale: " + getTotal() + "euro";
    }

}
