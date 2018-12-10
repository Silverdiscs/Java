// class Person
// {
//     private String name;
//     public void setName(String name)
//     {
//         this.name = name;
//     }
//     public String getName()
//     {
//         return this.name;
//     }
// }
// class Student extends Person
// {

// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         Student stu = new Student();
//         stu.setName("蠢人");
//         System.out.print(stu.getName());
//     }
// }



// class Person
// {
//    private String name;
//    private int age;
//    public Person(String name)
//    {
//        this.name = name;
//    }
//    public Person(String name,int age)
//    {
//        this(name);
//        this.age = age;
//    }
// }

// class Student extends Person
// {
//     public Student()
//     {
//         super("屁屁");
//         System.out.println("2.Student类的构造方法");
//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         Student stu = new Student();
//     }
// }



// final class Person
// {
//     public final void print()
//     {

//     }
// }


// public class test
// {
//     public static void main(String[] args)
//     {

//     }
// }


// class Person
// {
//     //常量  被 static 和 final 修饰
//     public static final int I = 10;
// }



// class Person
// {
//     public void print()
//     {
//         System.out.println("1. Father");
//     }
// }
// class Student extends Person
// {
//     public void print()
//     {
//         System.out.println("2. Son");
//     }
// }

// public class test
// {
//     public static void main(String[] age)
//     {
//         //向上转型，自动
//         Person per = new Student();
//         per.print();
//         //向下转型,需要强转
//         Student stu = (Student) per;
//         stu.print();
//     }
// }


class Person
{
    public void print()
    {
        System.out.println("Person类的print方法");
    }
}
class Student extends Person
{
    public void print()
    {
        System.out.println("Student类的print方法");
    }
}
class Worker extends Person
{
    public void print()
    {
        System.out.println("Worker类的print方法");
    }
}
public class test
{
    public static void main(String[] age)
    {
        fun(new Person());
        fun(new Student());
        fun(new Worker());
    }

    // 定义一个方法，接受 Person 类的所有子类对象并调用print()
    public static void fun(Person per)
    {
        per.print();
    }
    // public static void fun(Student per)
    // {
    //     stu.print();
    // }
    // public static void fun(Worker per)
    // {
    //     Worker.print();
    // }
}



































