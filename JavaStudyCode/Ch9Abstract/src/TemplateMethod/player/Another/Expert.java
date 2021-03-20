package TemplateMethod.player.Another;

/**
 * 고급자 레벨
 */
public class Expert extends Player{
    @Override
    void run() {
        System.out.println("아주 빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    void turn() {
        System.out.println("한 바퀴 돕니다.");
    }
}
