package reflect;

/**
 * Created by Thpffcj on 2017/8/4.
 */
public class ClassDemo4 {

    public static void main(String[] args) {
        ClassUtil.printFieldMessage("hello");
        System.out.println("=============");
        ClassUtil.printFieldMessage(new Integer(1));
    }
}
