package reflect;

/**
 * Created by Thpffcj on 2017/8/4.
 */
public class ClassDemo1 {

    public static void main(String[] args) {
        //Foo的实例对象如何表示
        Foo foo1 = new Foo();
        //Foo这个类也是一个实例对象,Class类的实例对象
        //任何一个内都是Class类的实例对象,这个实例对象有三种表示方法

        //第一种表示方式-->任何一个类都有一个隐含的的静态成员变量class
        Class c1 = Foo.class;

        //第二种表达方法,已知该类的对象通过getClass方法
        Class c2 = foo1.getClass();

        //c1,c2表示了Foo类的类类型(class type)
        //万事万物皆对象,类也是对象,是Class类的实例对象,这个对象我们称为该类的类类型

        //不管c1 or c2都代表了Foo类的类类型，一个类只可能是Class类的一个实例对象
        System.out.println(c1 == c2);

        //第三种表达方式
        Class c3 = null;
        try {
            c3.forName("reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //我们完全可以通过类的类类型创建该类的对象实例---->通过c1 or c2 or c3创建Foo的实例对象
        try {
            Foo foo = (Foo)c1.newInstance();//需要有无参数的构造方法
            foo.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Foo{
    void print(){
        System.out.println("foo");
    }
}