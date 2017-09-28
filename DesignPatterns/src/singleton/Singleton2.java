package singleton;

/**
 * 懒汉模式
 * 区别：饿汉模式的特点是加载类时比较慢，但运行时获取对象的速度比较快，线程安全
 *       懒汉模式的特点是加载类时比较快，但运行时获取对象的速度比较慢，线程不安全
 * Created by Thpffcj on 2017/9/28.
 */
public class Singleton2 {

    // 1.将构造方法私有化，不允许外部直接创建对象
    private Singleton2() {

    }

    // 2.创建类的唯一实例，使用 private static
    private static Singleton2 instance;

    // 3.提供一个用于获取实例的方法，使用 public static
    public static Singleton2 getInstance() {
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }
}
