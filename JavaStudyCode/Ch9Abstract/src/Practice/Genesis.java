package Practice;

public class Genesis extends Car{
    @Override
    void start() {
        System.out.println("Genesis 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Genesis 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Genesis 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Genesis 시동을 끕니다.");
    }
}
