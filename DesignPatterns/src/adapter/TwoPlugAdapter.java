package adapter;

/**
 * 二相转三相的插座适配器
 * Created by Thpffcj on 2017/9/29.
 */
public class TwoPlugAdapter implements ThreePlugIf {

    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug) {
        this.plug = plug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转化");
        plug.powerWithTwo();
    }
}
