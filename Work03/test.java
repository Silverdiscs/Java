// class Father
// {
//     private String name = "zhangjun";
//     class Child
//     {
//         public void introFather()
//         {
//             System.out.println(Father.this.name);
//         }
//     }
// }
// public class test
// {
//     public static void main(String[] args)
//     {
//         Father.Child in = new Father().new Child();
//         in.introFather();
//     }
// }

//-------------------------------------------------------------------------------------------------------------

// class A
// { 
//     int y = 6; 
//     class Inner//成员内部类
//     { 
//         static int y = 3; // 这里出现 static 关键字，报错
//         void show()
//         { 
//             System.out.println(y); 
//         } 
//     } 
// } 
// class test
// { 
//     public static void main(String [] args)
//     { 
//         A.Inner inner = new A().new Inner(); 
//         inner.show(); 
//     } 
// }
//运行结果 —— 编译失败，原因：成员内部类 不能存在 任何 static变量或方法


//------------------------------------------------------------------------------------------------------------

// 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
// 其各位数字立方和等于该数本身。
// 例如：153是一个 "水仙花数 ",因为153=1的三次方＋5的三次方＋3的三次方 

// class test
// {
//     public static void main(String[] args)
//     {
//         int a,b,c;
//         System.out.println("水仙花数：  ");
//         for(int i = 100; i <= 999; i++)
//         {
//             c = i / 100;
// 	        b = (i % 100) / 10;
// 	        a = i % 10;
//             if (i == a*a*a + b*b*b + c*c*c)
//             {
// 			    System.out.println(i);
// 		    }
//         }
//     }
// }

//-----------------------------------------------------------------------------------------------------------

// 定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量 
// 1）要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)， 
// 再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法， 
// 该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。 
// 2）从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外）， 
// 并扩展salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。 
// 同样要有至少两个构造方法，要体现出this和super的几种用法，还要求覆盖play()方法， 
// 并提供一个final sing()方法。 
// 3）"Manager"类继承"Employee"类，有一个final成员变量"vehicle" 
// 在main()方法中制造Manager和Employee对象,并测试这些对象的方法。

abstract class Role {
    private String name;
    private int age;
    private String sex;
    public Role(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public abstract void play();
}

class Employee extends Role {
    private double salary;
    private static String ID;
    
    public Employee() {
        super("张三",20,"男");
        System.out.println("Employee的无参构造");
    }

    public Employee(String name,int age,String sex,double salary) {
        super(name,age,sex);
        this.salary = salary;
    }

    public void play() {
        System.out.println(super.getName()+"在寂寞的玩LOL");
    }
    public final void sing() {
        System.out.println(super.getName()+"在寂寞的唱歌");
    }

}

class Manager extends Employee {
    // 奔驰
    public static final String vehicle = "Benz";
}



public class test {
    public static void main(String[] args) {
        Role role = new Employee();
        role.play();
        Employee employee = (Employee) role;
        employee.sing();
        Manager manager = new Manager();
        System.out.println(Manager.vehicle);

    }
}

























































































