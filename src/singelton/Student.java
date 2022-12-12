package singelton;

public class Student {

    public static Student student;
    private Student(){}

    public static Student getStudent(){
        if (student == null) student = new Student();
        return student;
    }


}
