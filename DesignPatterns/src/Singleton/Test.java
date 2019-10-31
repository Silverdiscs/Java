package Singleton;

/**
 * @Author: CX
 * @Date: 2019/10/14 上午 10:45
 * @Version 1.0
 * @Project: 单例设计模式
 */

public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);//true
/*        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s1 == s2);//true*/
    }
}

/**
 * 饿汉式
 */
//只能创建Singleton的单个实例
class Singleton {
    //1.私有化构造器，使得在类的外部不能够调用构造器
    private Singleton() {}
    //2.自己在类的内部创建一个类的实例
    private static Singleton instance = new Singleton();
    //3.私有是此对象，通过公共的方法来调用，体现封装性
    //4.此公共的方法，只能通过类来调用，因为设置为static的，同时类的实例也必须是static
    public static Singleton getInstance() {
        return instance;
    }
}

/**
 * 懒汉式
 */
class Singleton1 {
    //1.私有化构造器，使得在类的外部不能够调用构造器
    private Singleton1() {}
    //2.自己在类的内部创建一个类的实例，使其等于null
    private static Singleton1 instance = null;
    //3.声明公共的获取方法，只能通过类来调用，因为设置为static同时实例也必须为static声明的
    public static Singleton1 getInstance() {
        //4.懒汉式特点，判断是否已经实例化过了，有则直接返回，无则new一个
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
