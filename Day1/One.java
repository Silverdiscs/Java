public class One
{
    //程序入口
    public static void main(String[] args)
    {
        int age = 5;
        String name = "66";
        //声明并实例化了一个Dog对象
        Dog dog = new Dog(age,name);
        if(age < 10)
        {
            System.out.println("111");
        }
        else
        {
            System.out.println("222");
        }
        while(age > 0)
        {
            // ..
        }
        // 新启动一个线程
        // （）-> Lambda表达式
        new Thread(()->System.out.println("Hello World")).start();
        //异常处理
        try
        {
            File file = new File("/xx.txt");
        }
        catch(Execption e)
        {

        }
    }
}
class Dog
{
    private int age;
    private String name;
    public Dog(int age,String name)
    {
        this.name = name;
        this.age = age;
    }
}