package TemplateMethod.player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        Advanced a = new Advanced();
        player.upgradeLevel(a);
        player.play(2);

        Expert e = new Expert();
        player.upgradeLevel(e);
        player.play(3);
    }
}
