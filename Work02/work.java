// //创建一个类
// class Test
// {
//     public int i;
//     public char c;
// }
// public class work
// {
//     public static void main(String[] args)
//     {
//         //产生一个实例化对象
//         Test tst = new Test();
//         //输出的时候，调用类的属性，通过对象来调用
//         System.out.println(tst.i);
//         System.out.println(tst.c);
//     }
// }


//------------------------------------------------------------------------------------------------------------------

// class Person
// {
//     public String name;
//     public int age;
//     public static String country;
// }

// public class work
// {
//     public static void main(String[] args)
//     {
//         Person per = new Person();
//         per.name = "佛祖";
//         per.age = 1000;
//         Person.country = "天竺";

//         Person per1 = new Person();
//         per1.name = "悟空";
//         per1.age = 500;
//         Person.country = "中国";

//         System.out.println(per.country);
//         System.out.println(per1.country);
//     }
// }

//----------------------------------------------------------------------------------------------------------------------


//斐波那契数的实现：递归实现 斐波那契数,如求第5个斐波那契数
// public class work
// {
//     public static int fib(int n)
//     {
//         if (n < 3)
// 	    {
// 		    return 1;
// 	    }
// 	    return fib(n - 1) + fib(n - 2);
//     }
 
//     public static void main(String[] args) 
//     {
//         for(int i = 1; i <= 5 ; i++)
//         {
//             System.out.print(fib(i) + " ");
//         }
//     }
// }



//------------------------------------------------------------------------------------------------------------------------

public class work
{
    public work()
    {
        System.out.println("Hello Constructor");
    }
    public work(String s)
    {
        this();
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        new work("KingJames");
    }
}






















