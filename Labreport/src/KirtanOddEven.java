public class KirtanOddEven {
    public KirtanOddEven(int a){
        if(a%2==0){
            System.out.println(a+" is even");
        }else{
            System.out.println(a+" is odd");
        }
    }

    public static void main(String[] args) {
        KirtanOddEven check=new KirtanOddEven(99);
    }
}
