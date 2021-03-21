package Staretegy.Strategy.Vehicle;

import Staretegy.Strategy.Strategies.MovableStrategyInterface;

//운송수단 클래스 정의
public class Moving {
    private MovableStrategyInterface movableStrategy;

    public void move(){
        movableStrategy.move();
    }

    public void setMovableStrategy(MovableStrategyInterface movableStrategy){
        this.movableStrategy = movableStrategy;
    }
}
