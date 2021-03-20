package Practice.Another;

public class Car {
    private String carName;

    //추가
    public Car() {

    }

    public Car(String carName) {
        this.carName = carName;
    }

    void start(){
         System.out.println(carName + " 시동을 켭니다.");
     };
     void drive(){
         System.out.println(carName + " 달립니다.");
     };
     void stop(){
         System.out.println(carName + " 멈춥니다.");
     };

     void turnOff(){
         System.out.println(carName + " 시동을 끕니다.");
     };

    final public void run(){
        start();
        drive();
        stop();
        turnOff();
    }
}
