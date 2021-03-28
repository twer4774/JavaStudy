# Chapter 12 연습문제

## 5번

```java
package Practice.student;

import java.util.HashSet;

/**
 * 5번 연습문제
 * 100:홍길동,200:강감찬,300:이순신,400:정약용 이 나오도록 {@link Student} 클래스 구현하기
 * e단, 출력 순서는 상관 없습니다.
 */
public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("100" , "홍길동"));
        set.add(new Student("200" , "강감찬"));
        set.add(new Student("300" , "이순신"));
        set.add(new Student("400" , "정약용"));
        set.add(new Student("100" , "송중기"));

        System.out.println(set);
    }
}
//======================================================================================
package Practice.student;

public class Student {

    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student) obj;
            if (this.studentId == student.studentId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return studentId + ":" + name;
    }
}
/*
[400:정약용, 100:홍길동, 200:강감찬, 300:이순신]
*/
```

## 6번

```java
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
//==================================================================================
package Practice.car;

public class Car {
    String name;

    public Car() { }

    public Car(String name){
        this.name = name;
    }
}
//==================================================================================
package Practice.car;

import java.util.HashMap;

public class CarFactory {
    //싱글톤 패턴
    private static CarFactory instance = new CarFactory();

    private HashMap<String, Car> hashMap;

    public CarFactory(){
        hashMap = new HashMap<String, Car>();
    }

    public static CarFactory getInstance() {
        if(instance == null){
            instance = new CarFactory();
        }

        return instance;
    }

    public Car createCar(String carOwner) {
        if(hashMap.containsKey(carOwner)){
            return hashMap.get(carOwner);
        }

        Car car = new Car();
        hashMap.put(carOwner, car);
        return car;
    }

}
/*
2101440631
2101440631
true
2109957412
2109957412
true
false
*/
```

## 6번 다른 풀이 - 싱글톤의 사용이유?

- 위의 답은 싱글톤을 구현해야 하지만, 싱글톤을 안쓰는 경우 => CarFactory가 유일한 인스턴스를 갖지 않고, 여러개 갖는다면?
- 인스턴스 값이 달라지므로 모두 false를 출력한다. 물론 해시값도 달라진다.

```java
package Practice.car.anotehr;

import java.util.HashMap;

public class CarFactory {
//    //싱글톤 패턴
//    private static CarFactory instance = new CarFactory();

    private HashMap<String, Car> hashMap;

    public CarFactory(){
        hashMap = new HashMap<String, Car>();
    }

    /*public static CarFactory getInstance() {
        if(instance == null){
            instance = new CarFactory();
        }

        return instance;
    }*/

    public Car createCar(String carOwner) {
        if(hashMap.containsKey(carOwner)){
            return hashMap.get(carOwner);
        }

        Car car = new Car();
        hashMap.put(carOwner, car);
        return car;
    }

}
//===================================================================
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
/*
2101440631
2109957412
false
901506536
747464370
false
false
*/
```

