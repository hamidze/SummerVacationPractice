package singleton;

/**
 * 单例模式
 * 应用场合：有些对象有一个就足够了
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式，懒汉模式
 * Created by Thpffcj on 2017/9/28.
 */
public class Singleton {

    // 1.将构造方法私有化，不允许外部直接创建对象
    private Singleton() {

    }

    // 2.创建类的唯一实例，使用 private static
    private static Singleton instance = new Singleton();

    // 3.提供一个用于获取实例的方法，使用 public static
    public static Singleton getInstance() {
        return instance;
    }
}
