package SelfCoding;

/**
 * 나 혼자 코딩
 * 나이가 40살, 이름이 James라는 남자가 있습니다. 이 남자는 결혼을 했고, 자식이 셋 있습니다.
 * 나이, 이름, 결혼 여부, 자녀 수를 리턴하는 함수
 */
public class Person {
    int age;
    String name;
    boolean isMarried; //결혼여부
    int children; //자녀의 수

     public String toString(){
        return "나이 : " + age + " / "
                + "이름 : " + name + " / "
                + "결혼여부 : " + isMarried + " / "
                + "자녀의 수 : " + children;
    }
}

class PersonTest{
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 40;
        person.name = "James";
        person.isMarried = true;
        person.children = 3;

        System.out.println(person.toString());
    }
}
