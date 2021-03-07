package SelfCoding.test;

/**
 * test 패키지를 새로 만들고 Student와 StudentTest 분리
 */

public class Student {
    int studentID;
//    private String studentName;
    public String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
