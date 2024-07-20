package dupli;

interface A{
    public void printH();
}
interface B{
    public void printS();
}
public class KirtanInterface implements A,B{
    @Override
    public void printH() {
        System.out.println("I am happy");
    }

    @Override
    public void printS() {
        System.out.println("I am sad");
    }

    public static void main(String[] args) {
        KirtanInterface mood= new KirtanInterface();
        mood.printH();
        mood.printS();
    }
}
