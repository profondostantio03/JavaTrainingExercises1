package Purse;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Purse purse = new Purse ();

        Coin euro2 = new Coin("Due Euro", 2);
        Coin euro1 = new Coin("Euro", 1);
        Coin cent50 = new Coin("50 Centesimi", 5);
        Coin cent10 = new Coin("10 Centesimi", 10);

        purse.addCoin(euro2);
        purse.addCoin(euro1);
        purse.addCoin(cent50);
        purse.addCoin(cent10);

        System.out.println(euro1.getValore());

        System.out.println(purse);

        System.out.println("Numero di monete: " + purse.count());
        System.out.println("Totale: " + purse.getTotal() + "euro");

        System.out.println("Valore min: " + purse.getMin());
        System.out.println("Valore max: " + purse.getMax());

        System.out.println("Rimossa una moneta da 1euro");
        purse.removeCoin(euro1);
        System.out.println(purse);

    }
}
