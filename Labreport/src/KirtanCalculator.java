import java.util.Scanner;

public class KirtanCalculator {

    public KirtanCalculator(){
        System.out.println("Which operation do you want to perform:\n1.Add\n2.Subtract\n3.Multiply\n4.Division");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        KirtanCalculator calc=new KirtanCalculator();
        int input=sc.nextInt();
        System.out.println("Enter num a and num b:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        switch (input){
            case 1:
                System.out.println("Addition: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication: "+(a*b));
                break;
            case 4:
                System.out.println("Division: "+(a/b));
                break;
        }

    }
}
