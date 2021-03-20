package Abstract;

public class ComputerTest {
    public static void main(String[] args) {
        // 주석처리된 부분은 추상 클래스로, 인스턴스를 구현할 수 없기 때문에 에러를 표시한다.
//        Computer c1 = new Computer();
        Computer c2 = new Desktop();
//        Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();
    }
}
