package lambda;

@FunctionalInterface //메소드를 하나 이상 선언하면 오류 발생
public interface MyNumber {
    int getMax(int num1, int num2); //추상 메소드 선언
}
