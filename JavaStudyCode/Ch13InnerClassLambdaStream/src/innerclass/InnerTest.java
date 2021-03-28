package innerclass;

class OutClass{ //외부 클래스
    private int num = 10; //외부 클래스 private 변수
    private static int sNum = 20; //외부 클래스 정적 변수

    private InClass inClass; //내부 크래스 자료형 변수를 먼저 선언

    public OutClass(){
        inClass = new InClass();
    }

    class InClass{
        int inNum = 100; //내부 클래스의 인스턴스 변수

        void inTest(){
            System.out.println("OutClass num = " + num + "(외부 클래스 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스 정적 변수)");
        }
    } //InClass

    public void usingClass(){
        inClass.inTest();
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스를 이용하여 내부 클래스 기능 호출");
        //내부 클래스 기능 호출
        outClass.usingClass();
    }

}
