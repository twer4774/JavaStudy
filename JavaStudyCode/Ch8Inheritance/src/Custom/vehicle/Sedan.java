package Custom.vehicle;

public class Sedan extends Car{

    private final int capacity = 4;

    public Sedan(int speed, String model, String size) {
        super(speed, model, size);
    }

    @Override
    public void showInfo() {
        System.out.println("세단에 대한 정보 " +
                "속도는 : " + super.speed +
                " 모델은 :" + super.model +
                " 차문은 : " + this.capacity +"개 크기는 : "
                + super.size);
    }
}
