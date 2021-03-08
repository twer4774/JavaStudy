package ContructorCopy;

/**
 * 자바의 정석
 * 생성자를 이용한 인스턴스 복사
 */

class Car{
    String color;
    String gearType; //변속기 종류 - auto(자동), manual(수동)
    int door; //문의 개수

    Car(){
        this("White", "auto", 4);
    }

    //인스턴스의 복사를 위한 생성자
    Car(Car c){
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1); //c1의 복사본 c2 생성
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

        c1.door=100; //c1의 인스턴스 변수 door의 값 변경
        System.out.println("c1.door=100; 수행후");
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door); //Call By Value로 인해 c2의 속성은 변하지 않음

    }
}
