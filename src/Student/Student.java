package Student;

public class Student {

    private String name;
    private String course;
    private int age;

    public Student(String name, String course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public void details(){
        System.out.println("Name ->"+name);
        System.out.println("Course ->"+course);
        System.out.println("age ->"+age);
    }
}
