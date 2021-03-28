package Object.clone;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + "," + " y = " + y;
    }
}

//Cloneable : 객체를 복제해도 된다는 의미로 선언
class Circle implements Cloneable{
    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        this.point = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "원점은 " + point + "이고, " + "반지름은 " + radius + "입니다.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = (Circle) circle.clone();

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}
