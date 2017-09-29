package adapter;

/**
 * 采用继承方法的插座适配器
 * Created by Thpffcj on 2017/9/29.
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

    @Override
    public void powerWithThree() {
        System.out.println("借助继承适配器");
        this.powerWithTwo();
    }
}
