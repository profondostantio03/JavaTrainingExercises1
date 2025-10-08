package DistributoreBibite;

/**
 * Classe che modella un distributore automatico di bibite.
 * Ogni gettone inserito eroga una bibita se disponibile.
 *
 * @author ...
 * @version 1.0
 */
public class DistributoreBibite {

    // === Variabili di istanza ===
    private int numeroLattine;
    private int numeroGettoni;

    /**
     * Costruttore: inizializza il distributore con un certo numero di lattine.
     * @param lattineIniziali numero iniziale di lattine nel distributore
     */
    public DistributoreBibite(int lattineIniziali) {
        this.numeroLattine = lattineIniziali;
        this.numeroGettoni = 0;
    }

    /**
     * Aggiunge un certo numero di lattine al distributore.
     * @param n numero di lattine da aggiungere
     */
    public void riempi(int n) {
        if (n > 0) {
            numeroLattine += n;
        }
    }

    /**
     * Simula l’inserimento di un gettone da parte di un cliente.
     * Se ci sono lattine disponibili, viene erogata una bibita.
     * Altrimenti stampa un messaggio di avviso.
     */
    public void inserisciGettone() {
        if (numeroLattine > 0) {
            erogaBibita();
        } else {
            System.out.println("Nessuna bibita disponibile!");
        }
    }

    /**
     * Metodo privato che eroga una bibita:
     * decrementa il numero di lattine e incrementa i gettoni.
     */
    private void erogaBibita() {
        numeroLattine--;
        numeroGettoni++;
        System.out.println("Bibita erogata!");
    }

    /**
     * Restituisce il numero di lattine attuali.
     * @return numero di lattine
     */
    public int getNumeroLattine() {
        return numeroLattine;
    }

    /**
     * Restituisce il numero di gettoni raccolti.
     * @return numero di gettoni
     */
    public int getNumeroGettoni() {
        return numeroGettoni;
    }

    /**
     * Restituisce una rappresentazione testuale dello stato del distributore.
     * @return stringa descrittiva
     */
    @Override
    public String toString() {
        return "Lattine: " + numeroLattine + ", Gettoni: " + numeroGettoni;
    }

    // === Metodo main per testare la classe ===
    public static void main(String[] args) {
        DistributoreBibite d = new DistributoreBibite(1);

        System.out.println(d); // Stato iniziale

        d.inserisciGettone();
        d.inserisciGettone();

        System.out.println(d); // Stato dopo due acquisti

        d.riempi(3); // Aggiungiamo nuove lattine

        System.out.println(d); // Stato finale
    }
}

