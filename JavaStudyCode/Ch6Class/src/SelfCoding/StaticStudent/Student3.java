package SelfCoding.StaticStudent;

/**
 * 나 혼자 코딩
 * 학생마다 각각 다른 학생카드가 발급됩니다. 학생 카드 번호는 학번에 100을 더한 값
 * Sutdent3 클래스를 만들어 학생 카드 번호 멤버 변수를 추가하고, 학생이 생성될 때마다 학생 카드 번호를 부여
 * StudentTest6 클래스를 만들어 학생 두 명을 생성.
 * 두 학생의 카드 번호를 출력.
 */

public class Student3 {
    private static int serialNum =  1000;
    int studentID; //학번
    String studentName;
    int cardNum; //카드 번호 => 학번 + 100



    Student3(){
        //학번은 serialNum에서 1씩 증가
        serialNum++;
        studentID = serialNum;
        cardNum = studentID + 100;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

}
