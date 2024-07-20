public class KirtanOverload2 {
    public KirtanOverload2(){
        System.out.println("This is default constructor");
    }
    public KirtanOverload2(int a){
        System.out.println("This is parameterized constructor");
    }

    public static void main(String[] args) {
        KirtanOverload2 check=new KirtanOverload2();
        KirtanOverload2 check1=new KirtanOverload2(1);
    }
}
