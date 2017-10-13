package strategy;

import strategy.impl.FlyNoWay;

/**
 * Created by Thpffcj on 2017/10/1.
 */
public class BigYellow extends Duck {

    public BigYellow() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身黄黄");
    }

}
