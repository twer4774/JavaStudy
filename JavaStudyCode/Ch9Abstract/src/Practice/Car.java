package Practice;

public abstract class Car {
    abstract void start();
    abstract void drive();
    abstract void stop();
    abstract void turnOff();

    final public void run(){
        start();
        drive();
        stop();
        turnOff();
    }
}
