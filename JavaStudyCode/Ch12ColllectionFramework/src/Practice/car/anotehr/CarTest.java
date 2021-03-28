package Practice.car.anotehr;

/**
 * CarTest의 결과가 true, true, false가 되도록 HashMap을 사용하여 CarFactory 클래스를 구현해보세요
 */
public class CarTest {
    public static void main(String[] args) {
//        CarFactory factory = CarFactory.getInstance();

        //자동차 공장을 여러개 만든다.
        CarFactory factory1 = new CarFactory();
        CarFactory factory2 = new CarFactory();

        Car sonata1 = factory1.createCar("연수 차");
        Car sonata2 = factory2.createCar("연수 차");
        System.out.println(sonata1.hashCode());
        System.out.println(sonata2.hashCode());
        System.out.println(sonata1 == sonata2); //true

        Car avante1 = factory1.createCar("승연 차");
        Car avante2 = factory2.createCar("승연 차");

        System.out.println(avante1.hashCode());
        System.out.println(avante2.hashCode());
        System.out.println(avante1 == avante2);

        System.out.println(sonata1 == avante2);

    }
}
