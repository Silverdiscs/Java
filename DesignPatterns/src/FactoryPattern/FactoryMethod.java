package FactoryPattern;

/**
 * @Author: CX
 * @Date: 2019/10/31 上午 9:14
 * @Version 1.0
 * @Project: 工厂设计模式 —— 工厂方法模式
 */

// 1、定义一个抽象产品类 Ball
abstract class Ball {
    public Ball() {}
}
// 2、具体的产品类
class RedBall extends Ball {
    public RedBall() {
        System.out.println("生产红球");
    }
}
class BlueBall extends Ball {
    public BlueBall() {
        System.out.println("生产蓝球");
    }
}
// 3、工厂接口
interface BallFactory {
    public Ball createBall();
}
// 4、具体工厂
class RedBallFactory implements BallFactory {
    public RedBall createBall() {
        return new RedBall();
    }
}
class BlueBallFactory implements BallFactory {
    public BlueBall createBall() {
        return new BlueBall();
    }
}
// 5、用户
class FactoryMethodUser {
    public static void main(String[] args) {
        // 工厂方法时代
        RedBallFactory redBallFactory = new RedBallFactory();
        RedBall redBall = redBallFactory.createBall();

        BlueBallFactory blueBallFactory = new BlueBallFactory();
        BlueBall blueBall = blueBallFactory.createBall();
    }
}
