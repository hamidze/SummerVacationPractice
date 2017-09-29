package factory;

/**
 * 模拟客户端
 * Created by Thpffcj on 2017/9/28.
 */
public class Test {

    public static void main(String[] args) {

//        HairInterface left = new LeftHair();
//        left.draw();
//
//        HairInterface right = new RightHair();
//        right.draw();

        HairFactory factory = new HairFactory();
//        HairInterface left = factory.getHair("left");
//        left.draw();

        HairInterface left = factory.getHairByClass("factory.LeftHair");
        left.draw();
    }
}
