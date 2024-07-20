package dupli;

public class KirtanMathRandom {
    public static void main(String[] args) {
        double randomDouble = Math.random();
        int randomNumber = (int) (randomDouble * 101);

        System.out.println(randomNumber);
    }
}
