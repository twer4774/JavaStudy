package Practice;

public class Sonata extends Car{

    @Override
    void start() {
        System.out.println("Sonata 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Sonata 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Sonata 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Sonata 시동을 끕니다.");
    }
}
