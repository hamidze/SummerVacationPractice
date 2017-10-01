package Strategy;

import Strategy.impl.FlyWithWin;

/**
 * Created by Thpffcj on 2017/9/30.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }
}
