package July22;

import javax.swing.*;
import java.util.Date;

/**
 * @Author: CX
 * @Date: 2019/7/22 下午 2:30
 * @Version 1.0
 * @Project: 测试代码 简单工厂模式
 */

/*public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // 正向处理
        Date date = new Date();
//        System.out.println(date);
        // 取得Date类的Class对象的三种方式
        Class<Date> cls = (Class<Date>) date.getClass();
        System.out.println(cls);
        System.out.println(Date.class);
        Class cls1 = Class.forName("java.util.Date");
        System.out.println(cls1);
    }
}*/

/*public class Test {
    public static void main(String[] args) throws Exception{
        Class<Date> cls = Date.class;
        // 通过反射取得 Date对象
        Date date = cls.newInstance();
        System.out.println(date);
    }
}*/


// 实现基本的工厂模式

interface IComputer {
    void buyComputer();
}
class MacBook implements IComputer {

    @Override
    public void buyComputer() {
        System.out.println("买一台MacBook");
    }
}
class Surface implements IComputer {

    @Override
    public void buyComputer() {
        System.out.println("买一台Surface");
    }
}
class Lenovo implements IComputer {

    @Override
    public void buyComputer() {
        System.out.println("买一台Lenovo");
    }
}
class ComputerFactory {

    // 传统工厂模式
    /*public static IComputer getInstance(String computerName) {
        if (computerName.equals("mac")) {
            return new Macbook();
        }else if (computerName.equals("surface")) {
            return new Surface();
        }else {
            return null;
        }
    }*/

    // 接入反射后的工厂模式
    public static IComputer getInstance(String computerClass) {
        try {
            Class<?> cls = Class.forName(computerClass); // 取得class对象
            IComputer computer = (IComputer) cls.newInstance();
            return computer;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
public class Test {
    public static void main(String[] args) {
        IComputer computer =
                ComputerFactory.getInstance("July22.MacBook");
        computer.buyComputer();
    }
}

