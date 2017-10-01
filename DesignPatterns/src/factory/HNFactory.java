package factory;

/**
 * Created by Thpffcj on 2017/10/1.
 * 新年系列加工厂
 */
public class HNFactory implements PersonFactory {

    @Override
    public Boy getBoy() {
        // TODO Auto-generated method stub
        return new HNBoy();
    }

    @Override
    public Girl getGirl() {
        // TODO Auto-generated method stub
        return new HNGirl();
    }

}
