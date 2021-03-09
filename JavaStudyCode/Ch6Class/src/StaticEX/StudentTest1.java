package StaticEX;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("walter");
//        System.out.println(student.serialNum); //serialNum 변수의 초깃값 출력
//        student.serialNum++; //static 변수 값 증가

        System.out.println(student.serialNum);
        System.out.println(student.studentName + " 학번:" + student.studentID);


        Student student2 = new Student();
        student2.setStudentName("walter2");
        System.out.println(student2.serialNum);
        System.out.println(student2.studentName + " 학번:" + student2.studentID);
        //증가된 값 출력
//        System.out.println(student2.serialNum);
//        System.out.println(student2.serialNum);
    }
}
