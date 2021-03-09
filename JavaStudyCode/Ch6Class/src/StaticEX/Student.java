package StaticEX;

/**
 * static 사용
 */
public class Student {
    public static int serialNum = 1000; //static 변수는 인스턴스 생성과 무관하게 먼저 생성됨
    public int studentID;
    public String studentName;
    public int grade;
    public String address;


    //자동으로 학번생성
    public Student(){
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }
}
