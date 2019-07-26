package July22;

import java.lang.reflect.Constructor;

/**
 * @Author: CX
 * @Date: 2019/7/22 下午 3:48
 * @Version 1.0
 * @Project: 测试代码
 */
/*interface IMessage{}
interface INews{}
class MyClass implements IMessage,INews{}

public class Test2 {
    public static void main(String[] args) {
        Class<Test2> cls = Test2.class;
//        System.out.println(cls.getPackage().getName());
//        System.out.println(cls.getSuperclass());
        Class[] classes = MyClass.class.getInterfaces();
        for (Class cls1 : classes) {
            System.out.println(cls1);
        }
    }
}*/


class Animal {
    private Double weight;
    public Animal() {}
    private Animal(Double weight) {
        this.weight = weight;
    }
}

class Person {
    private Integer age;
    private String name;
    public Person() {
    }
    Person(Integer age) {
        this.age = age;
    }
    private Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Test2 {
    public static void main(String[] args) throws Exception{
        Class<Person> cls = Person.class;
/*        Constructor[] constructors = cls.getConstructors();
        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }*/
        /*Constructor constructor =
                cls.getDeclaredConstructor(Integer.class,String.class);
        System.out.println(constructor);*/
        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("----------------------------------");
        constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}















