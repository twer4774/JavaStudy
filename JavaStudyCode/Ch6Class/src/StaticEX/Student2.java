package StaticEX;

/**
 * static 사용
 */
public class Student2 {
    private static int serialNum = 1000; //static 변수는 인스턴스 생성과 무관하게 먼저 생성됨. private
    public int studentID;
    public String studentName;
    public int grade;
    public String address;


    //자동으로 학번생성
    public Student2() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
