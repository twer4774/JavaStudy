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
