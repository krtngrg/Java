import java.util.Scanner;


class Students{
    String name;
    int roll;
    String add;
    public Students(String name,int roll,String add){
    this.name=name;
    this.roll=roll;
    this.add=add;
    }
    float DSA;
    float PAS;
    float SAD;
    float JAVA;
    float WEB;
    public void result(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Address: "+add);
        float total=DSA+PAS+SAD+JAVA+WEB;
        System.out.println("Total marks obtained: "+total);
        float percent=((total)/500)*100;
        System.out.println("Percentage obtained: "+percent);
    }
}
public class KirtanStudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Students std1=new Students("Kirtan",1,"Gongabu");

        System.out.println("Enter your mark in DSA");
        std1.DSA= sc.nextFloat();
        System.out.println("Enter your mark in PAS");
        std1.PAS=sc.nextFloat();
        System.out.println("Enter your mark in SAD");
        std1.SAD=sc.nextFloat();
        System.out.println("Enter your mark in JAVA");
        std1.JAVA=sc.nextFloat();
        System.out.println("Enter your mark in WEB");
        std1.WEB=sc.nextFloat();

        std1.result();

    }
}
