package SelfCoding.SingletoneCar;

/**
 * 나 혼자 코딩
 * 자동차 공장은 유일한 객체이고, 이 공장에서 생상되는 자동차는 제작될 때마다 고유번호가 부여됨
 * 자동차 번호가 10001부터 시작하여 1씩 증가
 * 공장 클래스와 자동차 클래스, CarFactoryTest필요
 */
public class CarFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance(); //싱글톤 패턴
        Car mySonata = factory.createCar(); //메소드에서 Car 생성
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum()); //10001 출력
        System.out.println(yourSonata.getCarNum()); //10002 출력
    }
}
