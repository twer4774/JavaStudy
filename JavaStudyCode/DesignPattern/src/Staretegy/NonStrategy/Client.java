package Staretegy.NonStrategy;

public class Client {
    public static void main(String args[]){
        MovableInterface train = new Train();
        MovableInterface bus = new Bus();

        train.move();
        bus.move();
    }
}

/*
* 기차는 선로를 따라 이동하고, 버스는 도로를 따라 이동합니다.
그러다 시간이 흘러 선로를 따라 움직이는 버스가 개발되었다고 가정해봅시다.

그러면 Bus의 move() 메서드를 다음과 같이 바꿔주기면 하면 끝납니다.
*
* public void move(){
    System.out.println("선로를 따라 이동");
}
*
* OCP(Open-Closed Principle)에 위배

- 기존의 move()를 수정하지 않으면서 행위를 수정해야 하지만 여기서는 Bus의 move()를 직접 수정함 => Strategy 필요
* */
