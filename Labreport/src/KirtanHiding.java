
class Test{

    int value = 50;
    public void print() {
        int value= 100;
        System.out.println("Value of Instance variable : "+this.value);
        System.out.println("Value of Local variable : "+value);
    }
}


 public class KirtanHiding {
    public static void main(String args[]) {
        Test obj1 = new Test();
        obj1.print();
    }
}