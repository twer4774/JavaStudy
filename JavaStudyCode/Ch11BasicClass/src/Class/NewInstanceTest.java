package Class;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Person person1 = new Person();
        System.out.println(person1);


        Class pClass = Class.forName("Class.Person");
        Person person2 = (Person) pClass.newInstance();
        System.out.println(person2);
    }

}
