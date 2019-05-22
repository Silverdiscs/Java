import java.time.Period;
import java.util.*;

/**
 * @Author: CX
 * @Date: 2019/4/9 下午 9:13
 * @Version 1.0
 * List接口的使用
 */
//public class TestDemo {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(9);
//        System.out.println(list);
//        System.out.println(list.contains(3));
//        System.out.println(list.size());
//        System.out.println(list.remove(3));
//        System.out.println(list.get(2));
//        System.out.println(list.set(1,8));
//        System.out.println(list);
//    }
//}


//public class TestDemo {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Pi");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }
//}




//
//class Person {
//    private String name;
//    private Integer age;
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }else if (obj == null) {
//            return false;
//        }else if (!(obj instanceof Person)) {
//            return false;
//        }
//        //向下转型，还原为 Person对象
//        Person per = (Person) obj;
//        return this.age.equals(per.age) && this.name.equals(per.name);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        //保存自定义的 Person对象
//        List<Person> list = new ArrayList<>();
//        list.add(new Person("张三",20));
//        list.add(new Person("李四",18));
//        list.add(new Person("王五",16));
//        System.out.println(list);
//        System.out.println(list.contains(new Person("张三",20)));
//        System.out.println(list.remove(new Person("王五",16)));
//        System.out.println(list.size());
//        System.out.println(list);
//    }
//}


//public class TestDemo {
//    public static void main(String[] args) {
//        List<Integer> list = new Vector<>();
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(7);
//        System.out.println(list.contains(3));
//        System.out.println(list.remove(2));
//        System.out.println(list.get(1));
//        System.out.println(list.set(1,10));
//        System.out.println(list);
//    }
//}



//
//class Person implements Comparable<Person>{
//    private String name;
//    private Integer age;
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    //自定义 Person类如何比较大小
//    @Override
//    public int compareTo(Person o) {
//        if(this.age > o.age) {
//            return 1;
//        }else if (this.age < o.age) {
//            return -1;
//        }else {
//            return this.name.compareTo(o.name);
//        }
//    }
//}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        Set<Person> set = new TreeSet<>();
//        set.add(new Person("张三",20));
//        set.add(new Person("李四",18));
//        System.out.println(set);
//    }
//}




//class Person {
//    private String name;
//    private Integer age;
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//
///**
// * Person 类的比较器
// */
//class AscAgeComparator implements Comparator<Person> {//升序
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o1.getAge() - o2.getAge();
//    }
//}
//class DescAgeComparator implements Comparator<Person> {//降序
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o2.getAge() - o1.getAge();
//    }
//}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        Set<Person> set = new TreeSet<>(new DescAgeComparator());
//        set.add(new Person("张三",20));
//        set.add(new Person("李四",18));
//        set.add(new Person("张三",20));
//        System.out.println(set);
//    }
//}


//
//class Person {
//    private String name;
//    private Integer age;
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age,name);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        //自反性
//        if (obj == this) {
//            return true;
//        }
//        //非空性
//        else if (obj == null) {
//            return false;
//        }
//        else if (!(obj instanceof Person)) {
//            return false;
//        }
//        Person per = (Person) obj;
//        return per.age.equals(this.age) && per.name.equals(this.name);
//    }
//}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        Person per1 = new Person("张三",20);
//        Person per2 = new Person("张三",20);
//        System.out.println(per1.equals(per2));
//        Set<Person> set = new HashSet<>();
//        set.add(new Person("张三",20));
//        set.add(new Person("李四",18));
//        set.add(new Person("张三",20));
//        System.out.println(set);
//    }
//}


//
//class Person implements Comparable<Person> {//继承Comparable
//    private String name;
//    private Integer age;
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    //使用 compareTo() 方法
//    public int compareTo(Person o) {
//        if (this.age > o.age) {
//            return 1;
//        }else if (this.age < o.age) {
//            return -1;
//        }else {
//            return this.name.compareTo(o.name);
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        Set<Person> set = new TreeSet<>();
//        set.add(new Person("Peter",20));
//        set.add(new Person("Jack",18));
//        set.add(new Person("Peter",20));
//        set.add(new Person("Hill",26));
//        System.out.println(set);//Set接口不允许数据重复
//    }
//}



//public class TestDemo {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("Bit");
//        list.add("Hello");
//        list.add("Java");
//        //取得 ArrayList 的迭代器
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//}


//双向迭代输出 ListIterator
//public class TestDemo {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("Bit");
//        list.add("Hello");
//        list.add("Java");
//        //取得 ArrayList 的双向迭代器
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println("---------------------------");
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
//    }
//}




//Enumeration 枚举输出 举例
//public class TestDemo {
//    public static void main(String[] args) {
//        Vector<String> vector = new Vector<>();
//        vector.add("Hello");
//        vector.add("Bit");
//        vector.add("Hello");
//        vector.add("Java");
//        Enumeration<String> enumeration = vector.elements();
//        while (enumeration.hasMoreElements()) {
//            System.out.println(enumeration.nextElement());
//        }
//    }
//}



// for-each 输出示例
//public class TestDemo {
//    public static void main(String[] args) {
//        Vector<String> vector = new Vector<>();
//        vector.add("Hello");
//        vector.add("Bit");
//        vector.add("Hello");
//        vector.add("Java");
//        for (String str : vector) {
//            System.out.println(str);
//        }
//    }
//}




//fail-fast机制 演示
//public class TestDemo {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list,"A","B","D","C","A","B");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            if (str.equals("B")) {
////                iterator.remove();
//                //调用集合类提供的 remove()
//                list.remove("B");
//                continue;
//            }
//            System.out.println(str);
//        }
//    }
//}


//HashMap的使用
//public class TestDemo {
//    public static void main(String[] args) {
//        Map<Integer,String> map = new HashMap<>();
//        //当 key值重复，再次 put变为相应的更新操作
//        map.put(1,"hello"); //K值不能重复！
//        map.put(3,"Java");
//        map.put(2,"bit");
//        //取得当前 Map中的所有 key值
//        Set<Integer> keySet = map.keySet();
//        Iterator<Integer> iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//}




//对比 HashMap 和 HashSet
//public class TestDemo {
////    public static void main(String[] args) {
////        Map<Integer,String> map = new HashMap<>();
////        //当 key值重复，再次 put变为相应的更新操作
////        map.put(1,"hello"); //K值不能重复！
////        map.put(3,"Java");
////        map.put(2,"bit");
////        map.put(null,null);
////        map.put(null,null);
////        map.put(4,null);
////        //取得当前 Map中的所有 key值
////        Set<Integer> keySet = map.keySet();
////        Iterator<Integer> iterator = keySet.iterator();
////        while (iterator.hasNext()) {
////            System.out.println(iterator.next());
////        }
////        //根据 k值遍历 values值
////        for (Integer i : keySet) {
////            System.out.println(map.get(i));
////        }
////    }
////}


//iterator
//public class TestDemo {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("Pi");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//}



//ListIterator
//public class TestDemo {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("Pi");
//        list.add("Hello");
//        list.add("Peach");
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println("--------------------------");
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
//    }
//}


public class TestDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Dell");
        map.put(2,"Apple");
        map.put(3,"HUAWEI");
        map.put(4,"Google");
        map.put(null,null);
        map.put(null,null);
        map.put(5,null);
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer i : keySet) {
            System.out.println(map.get(i));
        }
    }
}














































































