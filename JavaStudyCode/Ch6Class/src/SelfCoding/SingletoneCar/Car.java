package SelfCoding.SingletoneCar;

public class Car {

    private static int serialNumber = 10001;
    int carNum;
    String carName;


    public Car() {
        serialNumber++;
        carNum = serialNumber;
    }


    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNumber) {
        this.carNum = carNumber;
    }

}
