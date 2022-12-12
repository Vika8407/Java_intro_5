package singelton;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        Student s3 = Student.getStudent();
        Student s4 = Student.getStudent();
        Student s5 = Student.getStudent();
        Student s6 = Student.getStudent();

        System.out.println(s1);//singelton.Student@1540e19d
        System.out.println(s2);//singelton.Student@1540e19d
        System.out.println(s3);//singelton.Student@1540e19d
        System.out.println(s4);//singelton.Student@1540e19d
        System.out.println(s5);//singelton.Student@1540e19d
        System.out.println(s6);//singelton.Student@1540e19d

        System.out.println("\n==========Test driver singleton==========\n");

        Driver d1 = Driver.getDriver();
        Driver d2 = Driver.getDriver();
        Driver d3 = Driver.getDriver();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
