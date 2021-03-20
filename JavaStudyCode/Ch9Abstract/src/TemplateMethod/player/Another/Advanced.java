package TemplateMethod.player.Another;

/**
 * 중급자
 */
public class Advanced extends Player{

    @Override
    void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    void turn() {
        System.out.println("turn 할 줄 모르지롱");
    }
}
