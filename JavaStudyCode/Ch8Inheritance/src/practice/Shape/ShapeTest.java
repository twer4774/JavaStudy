package practice.Shape;

import java.util.ArrayList;

/**
 * 다음과 같이 출력되도록 코드를 만드세요
 *
 * <출력결과>
 * Circle
 * Triangle
 * Shape
 * </출력결과>
 */
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
