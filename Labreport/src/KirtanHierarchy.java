package dupli;

class Student{
    String name;
    int age;
}

class Under_graduateStudent extends Student{
    String course;
}

class GraduateStudent extends Student{
    float gpa;
}
public class KirtanHierarchy {
    public static void main(String[] args) {
        Under_graduateStudent std1= new Under_graduateStudent();
        std1.name="Kirtan";
        std1.age=20;
        std1.course="BCA";
        GraduateStudent std2=new GraduateStudent();
        std2.gpa=3.77f;

    }
}
