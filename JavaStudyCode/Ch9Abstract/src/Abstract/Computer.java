package Abstract;

public abstract class Computer {

    //아래 두 메소드는 구현하는 클래스에 따라 구현이 달라진다.
    public abstract void display();
    public abstract void typing();

    //아래 두 메소드는 상속 받는 클래스에서 공통으로 사용된다.
    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }

    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}