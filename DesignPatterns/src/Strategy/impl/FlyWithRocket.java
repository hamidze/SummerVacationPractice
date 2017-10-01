package Strategy.impl;

import Strategy.FlyingStrategy;

/**
 * Created by Thpffcj on 2017/9/30.
 */
public class FlyWithRocket implements FlyingStrategy {

    public void performFly() {
        System.out.println("用火箭在太空遨游");
    }

}
