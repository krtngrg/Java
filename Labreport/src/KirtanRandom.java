package dupli;

import java.util.Random;

public class KirtanRandom {
    public static void main(String[] args) {
        Random random=new Random();
        int randomNumber = random.nextInt(101);
        System.out.println(randomNumber);
    }
}
