// class Outter
// {
//     private String msg = "Outter中的msg";
//     //---------------------------------------------------------------------------------------------
//     //内部类
//     class Inner
//     {
//         public void fun()
//         {
//             System.out.println(msg);
//         }
//     }
//     //---------------------------------------------------------------------------------------------
//     public void test()
//     {
//         //声明并实例化内部类
//         Inner in = new Inner();
//         in.fun();
//     }
// }

// public class test
// {
//     public static void main(String[] args)
//     {
//         Outter out = new Outter();
//         out.test();
//     }
// }


//将inner内部类放在外面，实现同样的功能
// class Outter
// {
//     private String msg = "Outter中的msg";
//     public String getMsg()
//     {
//         return msg;
//     }
//     public void test()//2
//     {
//         // this表示当前对象
//         Inner in = new Inner(this);//3
//         in.fun();//5
//     }
// }

// class Inner
// {
//     private Outter out;//4
//     // 构造注入
//     public Inner(Outter out)//4
//     {
//         this.out = out;
//     }
//     public void fun()
//     {
//         System.out.println(out.getMsg());//6
//     }
// }

// public class test
// {
//     public static void main(String[] args)
//     {
//         Outter out = new Outter();//1 
//         out.test();//2
//     }
// }


class A
{
    private String msg = "A的msg";
    public String getMsg()
    {
        return msg;
    }
}
class B
{
    private int age = 20;
    public int getAge()
    {
        return age;
    }
}
class C
{
    //--------------------------------------------------
    class InnerClassA extends A
    {
        public String name()
        {
            return super.getMsg();
        }
    }
    class InnerClassB extends B
    {
        public int age()
        {
            return super.getAge();
        }
    }
    //--------------------------------------------------
    public String name()
    {
        return new InnerClassA().name();
    }
    public int age()
    {
        return new InnerClassB().age();
    }
}

public class test
{
    public static void main(String[] args)
    {
        C c = new C();
        System.out.println(c.name());
        System.out.println(c.age());
    }
}

//创建非静态内部类
// class Outter
// {
//     private String msg = "Outter";
//     class Inner
//     {
//         public void fun()
//         {
//             // Outter.this  表示当前外部类对象
//             System.out.println(Outter.this.msg);
//         }
//     }
// }

// public class test
// {
//     public static void main(String[] args)
//     {
//         // 创建 Inner类对象
//         Outter.Inner in = new Outter().new Inner();
//         in.fun();
//     }
// }

//---------------------------------------------------------------------------------------------

// class Person
// {
//     private String name;
//     private int age;
//     public Person(String name,int age)
//     {
//         this.name = name;
//         this.age = age;
//     }
//     public void fun()
//     {
//         System.out.println("姓名： " + this.name + " " + "年龄： " + this.age);
//     }
// }

// public class test
// {
//     public static void main(String[] args)
//     {
//         Person per = new Person("屁屁", 18);
//         per.fun();
//     }
// }

//---------------------------------------------------------------------------------------------



















