package dupli;

import java.util.Scanner;

public class KirtanExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter X,Y,Z");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        try{
            double r=z/(x-y);
            System.out.println("R: "+r);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+e.getClass());
        }


    }
}
