package ContoBancarioSwing;

import java.util.Scanner;

class Conto {
    private final String intestatario;
    private double saldo;

    public Conto(String intestatario, double saldoIniziale) {
        this.intestatario = intestatario;
        this.saldo = saldoIniziale;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.printf("Hai depositato %.2f euro%n", importo);
        } else {
            System.out.println("Errore: importo inferiore a 0.");
        }
    }

    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.printf("Hai prelevato %.2f euro%n", importo);
        } else if (importo > saldo) {
            System.out.println("Errore: saldo non sufficiente.");
        } else {
            System.out.println("Errore: importo non valido.");
        }
    }

    public void applicaInteressi(double percentuale) {
        if (percentuale > 0) {
            double guadagno = saldo * percentuale / 100;
            saldo += guadagno;
            System.out.printf("Interessi applicati: %.2f euro%n", guadagno);
        } else {
            System.out.println("Inserisci una percentuale superiore allo 0.");
        }
    }
}

public class ContoBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci nome intestatario: ");
        String nome = sc.nextLine();

        Conto conto = new Conto(nome, 0.0);
        int scelta;

        do {
            System.out.println("\n<== Conto Corrente di " + conto.getIntestatario().toUpperCase() + " ==>");
            System.out.println("1. Visualizza saldo");
            System.out.println("2. Deposita");
            System.out.println("3. Preleva");
            System.out.println("4. Applica interessi");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1 -> System.out.printf("Saldo attuale: %.2f euro%n", conto.getSaldo());
                case 2 -> {
                    System.out.print("Inserisci importo da depositare: ");
                    double imp = sc.nextDouble();
                    conto.deposita(imp);
                }
                case 3 -> {
                    System.out.print("Inserisci importo da prelevare: ");
                    double imp = sc.nextDouble();
                    conto.preleva(imp);
                }
                case 4 -> {
                    System.out.print("Inserisci percentuale di interesse: ");
                    double perc = sc.nextDouble();
                    conto.applicaInteressi(perc);
                }
                case 5 -> System.out.println("Uscita dal programma...");
                default -> System.out.println("Inserire un numero tra 1 e 5!");
            }
        } while (scelta != 5);

        sc.close();
    }
}

