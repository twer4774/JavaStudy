package StaticEX;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 student = new Student2();
        student.setStudentName("walter");

        System.out.println(Student2.getSerialNum());
        System.out.println(student.studentName + " 학번:" + student.studentID);


        Student student2 = new Student();
        student2.setStudentName("walter2");
        System.out.println(Student2.getSerialNum());
        System.out.println(student2.studentName + " 학번:" + student2.studentID);
    }
}
