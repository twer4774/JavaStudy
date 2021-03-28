package Generics.GenericMethod;

public class GenericMethod {
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2){
        double left = ((Number) p1.getX()).doubleValue();
        double right = ((Number) p2.getX()).doubleValue();
        double top = ((Number) p1.getY()).doubleValue();
        double bottom = ((Number) p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }

    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        //문법이 눈에 안익는다. 그냥 메소드를 호출하는데 리턴타입을 넣어야함(생략해도 컴파일러가 알아서 유추함)
//        double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
        double rect = GenericMethod.makeRectangle(p1, p2);
        System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect);
    }

}
