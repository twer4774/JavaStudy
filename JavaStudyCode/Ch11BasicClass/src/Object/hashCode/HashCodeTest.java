package Object.hashCode;

class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return studentId + "," + studentName;
    }

    //해시 코드 값으로 학번 반환
    @Override
    public int hashCode() {
        return studentId;
    }
}

public class HashCodeTest {

    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");


        System.out.println("studentLee의 hashCode : " + studentLee.hashCode() );
        System.out.println("studentSang의 hashCode : " + studentSang.hashCode() );

        System.out.println("studentLee의 실제 주소 값: " + System.identityHashCode(studentLee));
        System.out.println("studentLee의 실제 주소 값: " + System.identityHashCode(studentSang));

    }

}
