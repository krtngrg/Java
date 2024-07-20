public class KirtanDivisible {
    public KirtanDivisible(int num){
        if(num%3==0){
            System.out.println(num+" is divisible by 3");
        } else if (num%7==0) {
            System.out.println(num+" is divisible by 7");
        }else{
            System.out.println(num+" is not divisible by 3 or 7");
        }
    }

    public static void main(String[] args) {
        KirtanDivisible check=new KirtanDivisible(334);
    }
}
