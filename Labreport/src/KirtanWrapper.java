package dupli;


public class KirtanWrapper {

    public static void main(String[] args) {


        int num = 11;
        Integer numInWrapper = num; // Autoboxing: int to Integer

        int unboxedNum = numInWrapper; // Unboxing: Integer to int



        System.out.println("Autoboxed Integer value: " + numInWrapper);
        System.out.println("Unboxed int value: " + unboxedNum);

    }
}
