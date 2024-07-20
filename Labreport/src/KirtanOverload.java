public class KirtanOverload {
    public int add(int a,int b){
       return a+b;
    }
    public double add(double a,double b){
       return a+b;
    }

    public static void main(String[] args) {
        KirtanOverload calc=new KirtanOverload();
        System.out.println("sum of 14 and 16 is: "+calc.add(14,16));
        System.out.println("sum of 19.99 and 2.222 is: "+calc.add(19.99,2.222));
    }
}
