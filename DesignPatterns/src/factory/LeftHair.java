package factory;

/**
 * 左偏分发型
 * Created by Thpffcj on 2017/9/28.
 */
public class LeftHair implements HairInterface {

    /**
     * 画了一个左偏分发型
     */
    @Override
    public void draw() {
        System.out.println("----左偏分发型----");
    }
}
