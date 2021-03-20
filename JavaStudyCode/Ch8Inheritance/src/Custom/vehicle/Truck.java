package Custom.vehicle;

public class Truck extends Car{

    private final int capacity = 2;

    public Truck(int speed, String model, String size) {
        super(speed, model, size);
    }

    @Override
    public void showInfo() {
        System.out.println("트럭에 대한 정보 " +
                "속도는 : " + super.speed +
                " 모델은 :" + super.model +
                " 차문은 : " + this.capacity +"개 크기는 : "
                + super.size);
    }
}
