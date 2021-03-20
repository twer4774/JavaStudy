package Custom.vehicle;

public class VehicleApplication {

    public static void main(String[] args) {

        Sedan sedan = new Sedan(70, "sonata", Size.NORMAL.getSize());
        Truck truck = new Truck(60, "porter", Size.BIG.getSize());

        Bike bike = new Bike(15, "MTB", Size.SMALL.getSize());

        sedan.start();
        sedan.run();
        sedan.end();
        sedan.showInfo();
        System.out.println();

        truck.start();
        truck.run();
        truck.end();
        truck.showInfo();
        System.out.println();

        bike.start();
        bike.run();
        bike.end();
        bike.showInfo();
        System.out.println();

        //final변수를 사용하기 때문에 디폴트 생성자를 사용하지 못함
        Vehicle vehicle = new Vehicle(0, null, null);
        vehicle.showInfo();
        System.out.println();

        Car car = new Car(0, null, null);
        car.showInfo();
    }
}
