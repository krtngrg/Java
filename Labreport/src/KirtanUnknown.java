class Student{
    String name;
    public Student(){
        this.name="Unknown";
    }
    public Student(String name){
        this.name=name;
    }

}

public class KirtanUnknown {
    public static void main(String[] args) {
        Student std1=new Student();
        Student std2=new Student("Mukesh");
        System.out.println("std1 name: "+std1.name);
        System.out.println("std2 name: "+std2.name);
    }
}
