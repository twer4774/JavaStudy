# Chapter 7 연습문제

## 4번

```java
package Practice.Dog;

public class Dog {
    private String name;
    private String type;

    public Dog(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String showDogInfo(){
        return name + ", " + type;
    }
}
```

```java
/**
 * 배열의 길이가 5인 Dog[] 배열을 만든 후
 * Dog 인스턴스를 5개 생성하여 배열에 추가
 * for문과 향상된 for문에서 Dog클래스의 showDogInfo() 메소드를 사용하여 배열에 추가한 Dog 정보를 모두 출력
 */
public class DogTest {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("왈왈이", "스피치");
        dogs[1] = new Dog("괄괄이", "리트리버");
        dogs[2] = new Dog("발발이", "치와와");
        dogs[3] = new Dog("돌돌이", "푸들");
        dogs[4] = new Dog("좔좔이", "비숑");

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].showDogInfo());
        }

        System.out.println("========= 향상된 for문 ==========");
        for (Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}

/*
왈왈이, 스피치
괄괄이, 리트리버
발발이, 치와와
돌돌이, 푸들
좔좔이, 비숑
========= 향상된 for문 ==========
왈왈이, 스피치
괄괄이, 리트리버
발발이, 치와와
돌돌이, 푸들
좔좔이, 비숑
*/
```

## 5번 - 4번을 ArrayList로 변환

```java
package Practice.Dog;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("왈왈이", "스피치"));
        dogs.add(new Dog("괄괄이", "리트리버"));
        dogs.add(new Dog("발발이", "치와와"));
        dogs.add(new Dog("돌돌이", "푸들"));
        dogs.add(new Dog("좔좔이", "비숑"));

        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).showDogInfo());
        }

        System.out.println("========= 향상된 for문 ==========");
        for (Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }

} 
/*
왈왈이, 스피치
괄괄이, 리트리버
발발이, 치와와
돌돌이, 푸들
좔좔이, 비숑
========= 향상된 for문 ==========
왈왈이, 스피치
괄괄이, 리트리버
발발이, 치와와
돌돌이, 푸들
좔좔이, 비숑
*/
```

