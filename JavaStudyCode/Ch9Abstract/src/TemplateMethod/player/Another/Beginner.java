package TemplateMethod.player.Another;

/**
 * 초급자 레벨
 */
public class Beginner extends Player{

    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("jump 할 줄 모르지롱");
    }

    @Override
    void turn() {
        System.out.println("turn 할 줄 모르지롱");
    }
}
