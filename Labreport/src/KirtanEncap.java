class Encap {
    private int a,b;
    public void setter(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int getsum(){
        return a+b;
    }

    public int getsub(){
        return a-b;
    }
}

public class KirtanEncap{
    public static void main(String[] args) {
     Encap num= new Encap();
     num.setter(12,33);
     System.out.println("Sum :"+num.getsum());
     System.out.println("Sub :"+num.getsub());
    }
}