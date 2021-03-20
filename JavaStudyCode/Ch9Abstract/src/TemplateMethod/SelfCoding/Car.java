package TemplateMethod.SelfCoding;

public abstract class Car {
    abstract void drive();
    abstract void stop();
    abstract void wiper();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    };

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    //템플릿 메소드
    final public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }

}
