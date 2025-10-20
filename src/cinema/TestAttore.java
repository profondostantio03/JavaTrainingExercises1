package cinema;

public class TestAttore {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();

        Attore a1 = new Attore("Gaetano Di Palma", rng);
        Attore a2 = new Attore("Gabriele De Sanctis", rng);

        System.out.println(a1);
        System.out.println(a2);
    }
}
