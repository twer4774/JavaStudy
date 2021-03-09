package SelfCoding.SingletoneCar;

public class CarFactory {

    //유일하게 생성한 인스턴스
    private static CarFactory instance = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance(){

        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }


    public Car createCar() {
        Car car = new Car();
        return car;
    }
}
