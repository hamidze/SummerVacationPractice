package strategy.impl;

import strategy.FlyingStrategy;

/**
 * Created by Thpffcj on 2017/9/30.
 */
public class FlyNoWay implements FlyingStrategy {

    public void performFly() {
        System.out.println("我不会飞行！");
    }

}
