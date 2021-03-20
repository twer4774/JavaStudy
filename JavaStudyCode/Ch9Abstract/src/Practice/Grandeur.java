package Practice;

public class Grandeur extends Car{
    @Override
    void start() {
        System.out.println("Grandeur 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Grandeur 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Grandeur 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Grandeur 시동을 끕니다.");
    }
}
