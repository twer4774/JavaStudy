package SelfCoding.test.test;

import SelfCoding.test.Student;

/**
 * 코드의 중복을 막기위해 test.test 패키지로 만듦
 *
 * Student 클래스의 접근제어자를 변경하여 기존에 있던 오류를 수정
 * private으로 접근 불가능한 studentName에 접근하기 위해 필요한것은?
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        //private에 접근 => Student의 studentName을 public으로 변
        student.studentName = "walter";
        student.setStudentName("walter");

        System.out.println(student.getStudentName());
    }
}
