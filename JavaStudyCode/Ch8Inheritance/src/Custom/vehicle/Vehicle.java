package Custom.vehicle;

public class Vehicle {

    protected final int speed;
    protected final String model;
    protected final String size;

    public Vehicle(int speed, String model, String size){
        this.speed = speed;
        this.model = model;
        this.size = size;
    }

    public void start(){
        System.out.println(model + "이(가)시동을 켭니다.");
    }

    public void run(){
        System.out.println(model + "이(가) 운행 중입니다.");
    }

    public void end(){
        System.out.println(model + "이(가) 시동을 끕니다.");
    }

    public void showInfo(){
        System.out.println("Vehicle 정보입니다.");
    }
}
