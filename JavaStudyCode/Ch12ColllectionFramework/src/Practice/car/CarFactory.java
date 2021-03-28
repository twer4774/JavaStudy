package Practice.car;

import java.util.HashMap;

public class CarFactory {
    //싱글톤 패턴
    private static CarFactory instance = new CarFactory();

    private HashMap<String, Car> hashMap;

    public CarFactory(){
        hashMap = new HashMap<String, Car>();
    }

    public static CarFactory getInstance() {
        if(instance == null){
            instance = new CarFactory();
        }

        return instance;
    }

    public Car createCar(String carOwner) {
        if(hashMap.containsKey(carOwner)){
            return hashMap.get(carOwner);
        }

        Car car = new Car();
        hashMap.put(carOwner, car);
        return car;
    }

}
