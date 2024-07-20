package dupli;

public class KirtanMathRandom {
    public static void main(String[] args) {
        double randomDouble = Math.random(); // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        int randomNumber = (int) (randomDouble * 101); // Scale and cast to int (0 to 100)

        System.out.println(randomNumber);
    }
}
