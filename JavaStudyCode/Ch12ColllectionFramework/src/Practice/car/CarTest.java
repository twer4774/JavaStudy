package Practice.car;

/**
 * CarTest의 결과가 true, true, false가 되도록 HashMap을 사용하여 CarFactory 클래스를 구현해보세요
 */
public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car sonata1 = factory.createCar("연수 차");
        Car sonata2 = factory.createCar("연수 차");
        System.out.println(sonata1.hashCode());
        System.out.println(sonata2.hashCode());
        System.out.println(sonata1 == sonata2); //true

        Car avante1 = factory.createCar("승연 차");
        Car avante2 = factory.createCar("승연 차");
        System.out.println(avante1.hashCode());
        System.out.println(avante2.hashCode());
        System.out.println(avante1 == avante2);

        System.out.println(sonata1 == avante2);

    }
}
