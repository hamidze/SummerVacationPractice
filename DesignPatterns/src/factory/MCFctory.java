package factory;

/**
 * Created by Thpffcj on 2017/10/1.
 * 圣诞系列加工厂
 */
public class MCFctory implements PersonFactory {

    @Override
    public Boy getBoy() {
        // TODO Auto-generated method stub
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        // TODO Auto-generated method stub
        return new MCGirl();
    }

}
