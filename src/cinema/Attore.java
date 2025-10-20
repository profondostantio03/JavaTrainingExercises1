package cinema;

public class Attore {
    private String nome;
    private int eta;
    private double popolarita;

    public Attore(String nome, RandomNumberGenerator rng){
        this.nome = nome;
        this.eta = rng.getRandomInt(15, 65);
        this.popolarita = rng.getRandomDouble();
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public double getPopolarita() {
        return popolarita;
    }

    @Override
    public String toString() {
        return "Attore{" + "nome=" + nome + ", età=" + eta + ", popolarita=" + popolarita + '}';
    }
}
