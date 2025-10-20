package cinema;
import java.util.Random;

public class RandomNumberGenerator {
    private Random random;
    public RandomNumberGenerator() {
        random = new Random();
    }

    public int getRandomInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public double getRandomDouble(){
        return random.nextDouble();
    }
}
