package dupli;

class Parent{
    public void displayname(){
        System.out.println("This is parent");
    }
}

class Child extends Parent{
    public void displayname(){
        System.out.println("This is child");
    }
}
public class KirtanOverride {
    public static void main(String[] args) {
        Parent check=new Child();   //override
        check.displayname();

        check=new Parent();         //dynamic memory dispatch
        check.displayname();
    }
}
