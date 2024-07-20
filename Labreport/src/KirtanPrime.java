public class KirtanPrime {
    public KirtanPrime(int a){
        int count=0;
        for(int x=1;x<=a;x++){
            if(a%x==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(a+" is prime");
        }else{
            System.out.println(a+" is composite");
        }
    }

    public static void main(String[] args) {
        KirtanPrime check = new KirtanPrime(17);
    }
}
