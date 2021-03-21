package Staretegy.NonStrategy;

public class Train implements MovableInterface {

    @Override
    public void move() {
        System.out.println("선로를 통해 이동");
    }
}
