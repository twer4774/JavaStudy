package String;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1 == s2); //주소 값이 다르므로 false
        System.out.println(s1.equals(s2)); //문자열 값이 같으므로 true

        String s3 = "abc";
        String s4 = "abc";

        System.out.println(s3 == s4); //문자열 abc는 상수 풀에 저장되어 있으므로 가리키는 주소 값이 같음
        System.out.println(s3.equals(s4)); //문자열 값이 같으므로 true

    }

}
