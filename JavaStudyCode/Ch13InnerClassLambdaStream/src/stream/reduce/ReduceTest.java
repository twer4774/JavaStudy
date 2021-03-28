package stream.reduce;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//BinaryOperator 구현
class ComparString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~~~", "hello", "Good Morning", "반갑습니다."};
        //람다식으로 구현
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
            if(s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else return s2;
        }));

        String str = Arrays.stream(greetings).reduce(new ComparString()).get();
        System.out.println(str);
    }
}
