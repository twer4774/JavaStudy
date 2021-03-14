# Chapter 8 연습문제

## 4번

```java
/**
 * 4번 연습문제 다음 코드는 오류가 발생합니다. 이유는?
 */

class Employee{
    public String name;
    public String grade;
    public Employee(String name){
        this.name = name;
    }
}

class Engineer extends Employee{
    private String skillSet;
 
  	public String getSkillSet(){
        return skillSet;
    }
  
    public void setSkillset(String skillSet){
        this.skillSet = skillSet;
    }
}
```

=> Employee에 Default 생성자가 없고 매개변수가 있는 생성자만 존재합니다.

=> 따라서 상속 받는 Engineer는 super 예약어를 이용해 Employee(String name)의 생성자를 생성해주어야 합니다.

```java
class Engineer extends Employee{
  ...
  public Engineer(String name){
    super(name);
  }
}
```

​	=> 또는 Employee에 Default 생성자를 추가해줘도 됩니다. 다만, Default 생성자가 없는 것은 객체를 생성할 때 이름을 필수값으로 지정하기 위해서이므로, 자식 클래스에서 super 예약어를 사용하는 것이 좋습니다.

## 5번

```java
/**
 * 다음과 같이 출력되도록 코드를 만드세요
 *
 * <출력결과>
 * Circle
 * Triangle
 * Shape
 * </출력결과>
 */

class Shape {

    public void draw(){
        System.out.println("Shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Triangle");
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        shapeList.add(new Circle());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());

        for (Shape s : shapeList) {
            s.draw();
        }
    }
}
```

