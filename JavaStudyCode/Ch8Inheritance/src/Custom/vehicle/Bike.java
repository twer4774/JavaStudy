package Custom.vehicle;

public class Bike extends Vehicle{


    public Bike(int speed, String model, String size) {
        super(speed, model, size);
    }

    @Override
    public void start() {
        System.out.println("자전거가 페달을 밟습니다.");
    }

    @Override
    public void run() {
        System.out.println("자전거가 운행합니다.");
    }

    @Override
    public void end() {
        System.out.println("자전거가 멈춥니다.");
    }

    @Override
    public void showInfo() {
        System.out.println("자전거에 대한 정보 " +
                "속도는 : " + super.speed +
                " 모델은 :" + super.model +
                " 크기는 :" + super.size
        );
    }
}
