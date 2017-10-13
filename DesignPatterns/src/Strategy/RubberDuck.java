package strategy;

import strategy.impl.FlyNoWay;

/**
 * Created by Thpffcj on 2017/10/1.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }


    public void quack(){
        System.out.println("嘎~嘎~嘎~");
    }

}
