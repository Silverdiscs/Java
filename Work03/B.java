class A
{ 
    public A()   //3
    { 
        System.out.println("A");   //4 
    } 
} 
class B extends A   //2
{ 
    public B()   //5
    { 
        System.out.println("B");   //6
    } 
    public static void main(String[] args)
    { 
        B b=new B();   //1
    } 
} 

//输出结果 ——  A  B

//分析 —— 
//从主函数 1 看起，先产生 B 的实例化对象，然后转到 2，由于 类B 继承了类A，所以先执行A，到 3 接着执行 4，然后输出 "A"
//执行完父类 A，接着到子类 B的方法，到 5 ，接着执行 6，输出"B"



















