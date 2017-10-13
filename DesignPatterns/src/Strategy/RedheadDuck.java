package strategy;

import strategy.impl.FlyWithWin;

/**
 * Created by Thpffcj on 2017/9/30.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}