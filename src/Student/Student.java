package Student;

public class Student implements Activity{

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

    @Override
    public void exam() {
        System.out.println("Exam of "+course+" is tough");
    }

    @Override
    public void marks() {
        System.out.println("Minimum percentage needed to pass is 50.5");
    }
}
