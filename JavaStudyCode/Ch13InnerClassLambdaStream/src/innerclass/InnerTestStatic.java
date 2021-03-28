package innerclass;

class OutClassStatic{ //외부 클래스
    private int num = 10; //외부 클래스 private 변수
    private static int sNum = 20; //외부 클래스 정적 변수

    static class InStaticClass{
        int inNum = 100; //정적 내부 클래스의 인스턴스 변수
        static int sInNum = 200; //정적 내부 클래스의 정적 변수

        //정적 내부 클래스의 일반 메소드
        void inTest(){
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스 인스턴스 변수)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스 정적 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스 정적 변수)");
        }

        //정적 내부 클래스의 정적 메소드
        static void sTest(){
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
        }

    } //InStaticClass
}

public class InnerTestStatic {
    public static void main(String[] args) {
        //외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성
        OutClassStatic.InStaticClass sInClass = new OutClassStatic.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메소드 호출");
        sInClass.inTest();
        System.out.println();
        System.out.println("정적 내부 클래스의 정적 메소드 호출");
        OutClassStatic.InStaticClass.sTest();
    }

}
