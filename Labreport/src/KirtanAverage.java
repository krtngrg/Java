import java.util.Scanner;

public class KirtanAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int i=0;
        int[] arr = new int[5];
        while(i<=4){
            System.out.println("Enter num"+i);
            arr[i]=sc.nextInt();
            i++;
        }

        int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        int average=sum/5;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
    }
}
