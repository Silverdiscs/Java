package FactoryPattern;

/**
 * @Author: CX
 * @Date: 2019/10/31 上午 8:56
 * @Version 1.0
 * @Project: 工厂设计模式 —— 简单工厂模式
 */

// 1、定义一个抽象类
abstract class Cloth {
    public Cloth() { }
}
// 2、具体产品类
class RedCloth extends Cloth {
    public RedCloth() {
        System.out.println("生产红衣服");
    }
}
class BlackCloth extends Cloth {
    public BlackCloth() {
        System.out.println("生产黑衣服");
    }
}
// 3、工厂类
class clothFactory {
    public Cloth createCloth(String type) {
        switch (type) {
            case "red":
                return new RedCloth();
            case "black":
                return new BlackCloth();
            default:
                break;
        }
        return null;
    }
}
// 4、用户
class SimpleFactoryUser {
    public static void main(String[] args) {
        // 简单工厂时代：东西都交给工厂来生产
        clothFactory factory = new clothFactory();
        // 接下来我们需要什么直接就去让工厂来创建
        factory.createCloth("red");
        factory.createCloth("black");
    }
}
