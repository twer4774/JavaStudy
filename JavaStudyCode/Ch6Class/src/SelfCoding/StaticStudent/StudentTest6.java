package SelfCoding.StaticStudent;

public class StudentTest6 {

    public static void main(String[] args) {
        Student3 student = new Student3();
        student.setStudentName("walter");
        System.out.println(student.studentName + " 학번: " + student.studentID + "카드번호 :" + student.cardNum);

        Student3 student2 = new Student3();
        student2.setStudentName("walter2");
        System.out.println(student2.studentName + " 학번: " + student2.studentID + "카드번호 :" + student2.cardNum);
    }


}
