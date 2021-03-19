package   Overriding.VirtualMethod;

public class TestA {
    public static void main(String[] args) {
        TestA a1 = new TestA();
        a1.aaa();

        TestA a2 = new TestA();
        a2.aaa();
    }

    private void aaa() {
        System.out.println("aaa() 출력");
    }
}
