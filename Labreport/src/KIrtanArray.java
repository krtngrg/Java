package dupli;

public class KIrtanArray {
    public static void main(String[] args) {
        int[] numbers = {55, 32, 45, 98, 82, 11, 9, 39, 50,2};

        int smallest;
        int largest = smallest = numbers[0];


        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
