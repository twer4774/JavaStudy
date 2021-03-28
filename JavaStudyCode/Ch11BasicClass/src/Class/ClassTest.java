package Class;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        //Object의 getClass() 사용하기
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        //직접 class 파일 대입하기
        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());


        //클래스 이름으로 가져오기. forName은 예외처리 필요
        Class pClass3 = Class.forName("Class.Person");
        System.out.println(pClass1.getName());

    }
}
