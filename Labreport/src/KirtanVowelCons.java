import java.util.Scanner;

public class KirtanVowelCons {
    int count=0;
    public KirtanVowelCons(char x){
        for(int i=97;i<=122;i++){
            if(x==(char) i){
                count++;
            }
        }
        for(int i=65;i<=90;i++){
            if(x==(char) i){
                count++;
            }
        }
        if(count==0){
            System.out.println(x+" doesn't fall under alphabet");
        } else if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A'
                ||x=='E'||x=='I'||x=='O'||x=='U') {
            System.out.println(x+" is a vowel");
        }else{
            System.out.println(x+" is a consonant");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter");
        char c=sc.next().charAt(0);
        KirtanVowelCons check=new KirtanVowelCons(c);

    }

}

