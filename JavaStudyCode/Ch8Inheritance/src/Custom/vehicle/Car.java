package Custom.vehicle;

public class Car extends Vehicle{


    public Car(int speed, String model, String size) {
        super(speed, model, size);
    }


    @Override
    public void showInfo() {
        System.out.println("자동차 클래스의 정보");
    }
}
