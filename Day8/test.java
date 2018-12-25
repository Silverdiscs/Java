//抽象类
// abstract class Person
// {
//     //抽象方法
//     public abstract void print();
//     //抽象方法
//     public abstract void fun();
// }
// //抽象类的子类（不是抽象类）必须覆写 抽象类的所有抽象方法
// class Student extends Person
// {
//     public void print()
//     {

//     }
//     public void fun()
//     {

//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         // System.out.print(Person.a);
//         Person per = new Student();
//     }
// }

//-----------------------------------------------------------------------------------------------

//抽象类可以使用子类向上转型为其实例化，抽象类一定不能直接实例化对象
//抽象类
// abstract class Person
// {
//     //抽象方法
//     public abstract void print();
// }

// class Student extends Person
// {
//     public void print()
//     {
//         System.out.println("Hello,I am a student");
//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         Person per = new Student();
//         per.print();
//     }
// }

//----------------------------------------------------------------------------------------------

//抽象类也存在构造方法，并且子类也一定按照实例化流程，先调用抽象类的构造方法而后在调用子类构造方法
//抽象类
// abstract class Person
// {
//     public Person()
//     {
//         System.out.println("1. 抽象类的构造方法");
//     }
//     //抽象方法
//     public abstract void print();
// }

// class Student extends Person
// {
//     public Student()
//     {
//         System.out.println("2. 子类的构造方法");
//     }
//     public void print()
//     {
//         System.out.println("Hello,I am a student");
//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         new Student();
//     }
// }

//-----------------------------------------------------------------------------------------------

//笔试题
// abstract class Person
// {
//     public Person()//2
//     {
//         this.print();//3.1
//     }
//     //抽象方法
//     public abstract void print();//3.2
// }
// class Student extends Person
// {
//     // private int num = 100;
//     public Student(int num)//1.2
//     {
//         super();//隐藏代码
//         int num = 100;
//         this.num = num;
//     }
//     public void print()//4
//     {
//         System.out.println(this.num);//5
//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         new Student(30);//1.1
//     }
// }


//笔试题 变式
// abstract class Person
// {
//     public Person()//2
//     {
//         this.print();//3.1
//     }
//     //抽象方法
//     public abstract void print();//3.2
// }
// class Student extends Person
// {
//     private int num = 100;
//     public Student(int num)//1.2
//     {
//         super();//隐藏代码
//         this.num = num;
//     }
//     public void print()//4
//     {
//         System.out.println(this.num);//5
//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         new Student(30).print();//1.1
//     }
// }

//--------------------------------------------------------------------------------------------------------------------

//抽象类无法直接实例化对象
// abstract class Person
// {
//     public void print()
//     {

//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         new Person();
//     }
// }


// abstract class Person
// {
//     public abstract void tool1();
//     abstract class Inner
//     {
//         public abstract void tool2();
//     }
// }
// class Student extends Person
// {
//     public void tool1()
//     {

//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         new Student();
//     }
// }


//---------------------------------------------------------------------------------------------------------------------


//冲咖啡
// class Coffee
// {
//     void Prepare()
//     {
//         boilWater();//烧开水
//         brewCoffee();//冲泡咖啡
//         pourInCup();//把咖啡带进杯子中
//         addSugarAndMilk();//加糖和奶
//     }
//     public void boilWater()
//     {
//         System.out.println("烧水");
//     }
//     public void brewCoffee()
//     {
//         System.out.println("冲泡咖啡")
//     }
//     public void pourInCup()
//     {
//         System.out.println("把咖啡倒进杯子中");
//     }
//     public void addSugarAndMilk()
//     {
//         System.out.println("加咖啡和奶");
//     }
// }

//冲茶
// class tea
// {
//     void Prepare()
//     {
//         boilWater();//烧开水
//         steepTeabag();//冲泡茶
//         pourInCup();//把茶叶放进杯子中
//         addLemon();//加柠檬
//     }
//     public void boilWater()
//     {
//         System.out.println("烧水");
//     }
//     public void steepTeabag()
//     {
//         System.out.println("冲泡茶");
//     }
//     public void pourInCup()
//     {
//         System.out.println("把茶叶放进杯子中");
//     }
//     public void addLemon()
//     {
//         System.out.println("加柠檬");
//     }
// }


//---------------------------------------------------------------------------------------------------------------------

// abstract class Drink
// {
//     final void Prepare()
//     {
//         boilWater();
//         brew();
//         pourInCup();
//         addSomething();
//     }
//     abstract void brew();
//     abstract void addSomething();
//     void boilWater()
//     {
//         System.out.println("烧水");
//     }
//     void pourInCup()
//     {
//         System.out.println("倒进杯子里");
//     }
// }
// class Tea extends Drink
// {
//     void brew()
//     {
//         System.out.println("冲咖啡");
//     }
//     void addSomething()
//     {
//         System.out.println("加柠檬");
//     }
// }
// class Coffee extends Drink
// {
//     void brew()
//     {
//         System.out.println("冲茶");
//     }
//     void addSomething()
//     {
//         System.out.println("加糖和奶");
//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         Drink Coffee = new Coffee();
//         Drink Tea = new Tea();
//         Coffee.Prepare();
//         Tea.Prepare();
//     }
// }




abstract class PlayBall
{
    final void Prepare()
    {
        wear();
        takeBall();
        goToGround();
        play();
    }
    void wear()
    {
        System.out.println("穿衣服");
    }
    void play()
    {
        System.out.println("开始玩");
        System.out.println("--------------");
    }
    abstract void takeBall();
    abstract void goToGround();
}
class Basketball extends PlayBall
{
    void takeBall()
    {
        System.out.println("带篮球");
    }
    void goToGround()
    {
        System.out.println("去篮球场");
    }
}
class Football extends PlayBall
{
    void takeBall()
    {
        System.out.println("带足球");
    }
    void goToGround()
    {
        System.out.println("去足球场");
    }
}
public class test
{
    public static void main(String[] args)
    {
        PlayBall Basketball = new Basketball();
        PlayBall Football = new Football();
        Basketball.Prepare();
        Football.Prepare();
    }
}






































































