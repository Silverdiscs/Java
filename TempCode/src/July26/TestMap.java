package July26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: CX
 * @Date: 2019/7/26 下午 3:55
 * @Version 1.0
 * @Project: Map测试类
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"java");
        map.put(2,"c++");
        map.put(3,"html");
        map.put(4,"go");
        map.put(5,"swift");
        map.put(6,"matlab");
        map.put(7,"c#");
        map.put(8,"sql");
        System.out.println("Map的数据：" + map);
        System.out.println("Map的数据数量：" + map.size());
        System.out.println("获取key = 1的值：" + map.get(1));
        System.out.println("获取key = 6的值：" + map.get(6));
        System.out.println("获取所有的key：" + map.keySet());
        System.out.println("获取所有的value：" + map.values());
        System.out.println("判断key = 7是否存在：" + map.containsKey(3));

        System.out.println("删除key = 7的元素：" + map.remove(7));

        System.out.println("Map的三种遍历：");

        for (Integer key : map.keySet()) {
            System.out.printf("%d = %s \n",key,map.get(key));
        }

        System.out.println("-------------------");

        for (String value : map.values()) {
            System.out.printf("%s \n",value);
        }

        System.out.println("-------------------");

        for(Map.Entry<Integer,String> entry :  map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%d = %s \n",key,value);
        }

        System.out.println("-------------------");

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key =  iterator.next();
            String value = map.get(key);
            System.out.printf("%d = %s \n",key,value);
        }
    }
}
