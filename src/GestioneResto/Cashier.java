package GestioneResto;

public class Cashier {

    private double amountDue;      // importo da pagare
    private double amountReceived; // importo versato dal cliente

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    // imposta la somma ricevuta
    public void receive(double amountReceived) {
        this.amountReceived = amountReceived;
    }

    // calcolo resto totale
    private double getChange() {
        return amountReceived - amountDue;
    }

    public void calculateChange() {
        double change = getChange();

        if (change < 0) {
            System.out.println("Somma insufficiente! Mancano " + (-change) + " euro.");
            return;
        }

        System.out.printf("Resto totale: %.2f euro%n", change);
        System.out.println("Suddivisione in monete:");

        int twoEuro = return2Euro(change);
        change -= twoEuro * 2.0;

        int oneEuro = return1Euro(change);
        change -= oneEuro * 1.0;

        int fiftyCent = return50Cent(change);
        change -= fiftyCent * 0.50;

        int twentyCent = return20Cent(change);
        change -= twentyCent * 0.20;

        int tenCent = return10Cent(change);
        change -= tenCent * 0.10;

        int fiveCent = return5Cent(change);
        change -= fiveCent * 0.05;

        int twoCent = return2Cent(change);
        change -= twoCent * 0.02;

        int oneCent = return1Cent(change);
        change -= oneCent * 0.01;

        System.out.println("2 euro: " + twoEuro);
        System.out.println("1 euro: " + oneEuro);
        System.out.println("50 cent: " + fiftyCent);
        System.out.println("20 cent: " + twentyCent);
        System.out.println("10 cent: " + tenCent);
        System.out.println("5 cent:  " + fiveCent);
        System.out.println("2 cent:  " + twoCent);
        System.out.println("1 cent:  " + oneCent);
    }

    private int return2Euro(double change) {
        return (int)(change / 2);
    }

    private int return1Euro(double change) {
        return (int)(change / 1);
    }

    private int return50Cent(double change) {
        return (int)(change / 0.50);
    }

    private int return20Cent(double change) {
        return (int)(change / 0.20);
    }

    private int return10Cent(double change) {
        return (int)(change / 0.10);
    }

    private int return5Cent(double change) {
        return (int)(change / 0.05);
    }

    private int return2Cent(double change) {
        return (int)(change / 0.02);
    }

    private int return1Cent(double change) {
        return (int)Math.round(change / 0.01);
    }

    public static void main(String[] args) {
        Cashier c = new Cashier();
        c.setAmountDue(7.58);
        c.receive(10.00);
        c.calculateChange();
    }
}

