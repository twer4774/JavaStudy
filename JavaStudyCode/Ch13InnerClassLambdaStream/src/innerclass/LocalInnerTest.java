package innerclass;

class Outer{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;

        //지역 내부 클래스
        class MyRunnalbe implements Runnable {
            //지역 내부 클래스의 인스턴스 변수
            int localNum = 10;

            @Override
            public void run(){
                System.out.println("i =" + i);
                System.out.println("num =" + num);
                System.out.println("localNum =" + localNum);
                System.out.println("outNum =" + outNum);
                System.out.println("Outer.sNum =" + Outer.sNum);
            }
        }
        return new MyRunnalbe();
    }//getRunnable()
}


public class LocalInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(10); //메소드 호출
        runner.run();
    }
}
