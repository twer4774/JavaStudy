# Chapter13 연습문제

## 6번

```java

package Practice;

public class Book {

    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

//================================================================
package Practice;

import java.util.ArrayList;
import java.util.List;

/**
 * 모든 책의 가격의 합
 * 책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력
 */
public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));


        //스트림 생성하고 출력하기

        //모든 책의 가격의 합
        System.out.println( bookList.stream().mapToInt(p -> p.getPrice()).sum() );

        //책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력
        bookList.stream().filter(p -> p.getPrice() >= 20000).map(Book::getName).forEach(System.out::println);
    }
}
/*
70000
자바
안드로이드
*/
```

