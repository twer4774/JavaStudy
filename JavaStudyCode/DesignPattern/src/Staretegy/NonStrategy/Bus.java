package Staretegy.NonStrategy;

public class Bus implements MovableInterface{

    @Override
    public void move() {
        System.out.println("도로를 따라 이동");
    }
}
