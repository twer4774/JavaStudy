package TemplateMethod.player;

/**
 * 고급자 레벨
 */
public class Expert extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("아주 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급자 레벨입니다.");
    }
}
