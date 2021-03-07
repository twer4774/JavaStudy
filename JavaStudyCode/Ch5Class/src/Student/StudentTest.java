package Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentName = "walter";

        System.out.println(student.studentName);
        System.out.println(student.getStudentName());
    }
}
