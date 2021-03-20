package TemplateMethod.player.Another;

public abstract class Player {
    abstract void run();
    abstract void jump();
    abstract void turn();

    final public void go(int count){
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}
