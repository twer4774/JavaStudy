# 챕터 9 연습문제

## 5번

```java
package Practice;

public abstract class Car {
    abstract void start();
    abstract void drive();
    abstract void stop();
    abstract void turnOff();

    final public void run(){
        start();
        drive();
        stop();
        turnOff();
    }
}
//=============================================
package Practice;

public class Avante extends Car{

    @Override
    void start() {
        System.out.println("Avante 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Avante 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Avante 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Avante 시동을 끕니다.");
    }
}
//=============================================
package Practice;

public class Grandeur extends Car{
    @Override
    void start() {
        System.out.println("Grandeur 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Grandeur 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Grandeur 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Grandeur 시동을 끕니다.");
    }
}
//=============================================
package Practice;

public class Sonata extends Car{

    @Override
    void start() {
        System.out.println("Sonata 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Sonata 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Sonata 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Sonata 시동을 끕니다.");
    }
}
//=============================================
package Practice;

public class Genesis extends Car{
    @Override
    void start() {
        System.out.println("Genesis 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Genesis 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Genesis 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Genesis 시동을 끕니다.");
    }
}
//=============================================
package Practice;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Avante());
        carList.add(new Genesis());
        for (Car car : carList) {
            car.run();
            System.out.println("================");
        }
    }
}
```

## 의문점 - 추상 클래스를 사용하지 않고 구현한 경우

- 추상클래스를 써야 하는가?
  - Override 하는 부분이 많아서 일반 클래스에서 생성자로 처리함

```java
package Practice.Another;

public class Car {
    private final String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    void start(){
         System.out.println(carName + " 시동을 켭니다.");
     };
     void drive(){
         System.out.println(carName + " 달립니다.");
     };
     void stop(){
         System.out.println(carName + " 멈춥니다.");
     };

     void turnOff(){
         System.out.println(carName + " 시동을 끕니다.");
     };

    final public void run(){
        start();
        drive();
        stop();
        turnOff();
    }
}
//=============================================
package Practice.Another;

public class Avante extends Car {
    public Avante(String carName) {
        super(carName);
    }
}

//=============================================
package Practice.Another;

public class Sonata extends Car {
    public Sonata(String carName) {
        super(carName);
    }
}

//=============================================
package Practice.Another;

public class Grandeur extends Car {
    public Grandeur(String carName) {
        super(carName);
    }
}
//=============================================
package Practice.Another;

public class Genesis extends Car {
    public Genesis(String carName) {
        super(carName);
    }
}
//=============================================
package Practice.Another;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<Car>();
      //이름을 초기화하는 것이 다름
        carList.add(new Sonata("Sonata"));
        carList.add(new Grandeur("Grandeur"));
        carList.add(new Avante("Avante"));
        carList.add(new Genesis("Genesis"));
        for (Car car : carList) {
            car.run();
            System.out.println("================");
        }
    }
}
```

## 생성자에서 다른 생성자를 불러와 사용하는 경우

- CarTest에서 이름을 넣으면서 초기화하기 귀찮아서 해봄

```java
package Practice.Another;

public class Car {
    private String carName;

    //추가
    public Car() {

    }

    public Car(String carName) {
        this.carName = carName;
    }

    void start(){
         System.out.println(carName + " 시동을 켭니다.");
     };
     void drive(){
         System.out.println(carName + " 달립니다.");
     };
     void stop(){
         System.out.println(carName + " 멈춥니다.");
     };

     void turnOff(){
         System.out.println(carName + " 시동을 끕니다.");
     };

    final public void run(){
        start();
        drive();
        stop();
        turnOff();
    }
}
//============================================================
public class Avante extends Car {

    public Avante(){
        this("Avante");
    }

    public Avante(String carName) {
        super(carName);
    }
}
//============================================================
package Practice.Another;

public class Genesis extends Car {
    public Genesis(){
        this("Genesis");
    }

    public Genesis(String carName) {
        super(carName);
    }
}
//============================================================
package Practice.Another;

public class Grandeur extends Car {
    public Grandeur(){
        this("Grandeur");
    }

    public Grandeur(String carName) {
        super(carName);
    }
}
//============================================================
package Practice.Another;

public class Sonata extends Car {

    public Sonata(){
        this("Sonata");
    }

    public Sonata(String carName) {
        super(carName);
    }
}
//============================================================
public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Avante());
        carList.add(new Genesis());
        for (Car car : carList) {
            car.run();
            System.out.println("================");
        }
    }
}
```

