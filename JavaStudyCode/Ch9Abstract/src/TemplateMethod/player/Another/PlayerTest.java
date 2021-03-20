package TemplateMethod.player.Another;

public class PlayerTest {
    public static void main(String[] args) {
        System.out.println("========초보===========");
        Beginner beginner = new Beginner();
        beginner.go(1);

        System.out.println("========중급===========");
        Advanced advanced = new Advanced();
        advanced.go(2);

        System.out.println("========고급===========");
        Expert expert = new Expert();
        expert.go(3);
    }
}
