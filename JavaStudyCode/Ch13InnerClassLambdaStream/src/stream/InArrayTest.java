package stream;

import java.util.Arrays;

public class InArrayTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sumVal = Arrays.stream(arr).sum();
        //count() 메서드의 반환값은 long타입이므로 int로 다운캐스팅
        int count = (int)Arrays.stream(arr).count();

        System.out.println(sumVal);
        System.out.println(count);
    }
}
