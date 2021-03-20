package Practice;

public class Avante extends Car{

    @Override
    void start() {
        System.out.println("Avante 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Avante 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Avante 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Avante 시동을 끕니다.");
    }
}
