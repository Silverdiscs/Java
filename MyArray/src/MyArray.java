import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/3/12 19:26
 * @Version 1.0
 */
public class MyArray {
    //用于存储数据的数组
    private int[] elements;
    public MyArray() {
        elements = new int[0];
    }
    //获取数组长度的方法
    public int size() {
        return elements.length;
    }

    //往数组的末尾添加一个元素
    public void add(int element) {
        //创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        //把原数组中的元素复制到新数组中
        for (int i = 0;i < elements.length;i++) {
            newArr[i] = elements[i];
        }
        //把添加的元素放入新数组中
        newArr[elements.length] = element;
        //使用新数组替换旧数组
        elements = newArr;
    }

    //打印所有元素到控制台
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    //删除数组中的元素
    public void delete(int index) {
        if (index < 0 || index > elements.length-1) {
            //判断下标是否越界
            throw new RuntimeException("下标越界");
        }
        //创建一个新的数组，长度为原数组的长度 —1
        int[] newArr = new int[elements.length-1];
        //复制原有数据到新数组
        for(int i = 0;i < newArr.length;i++) {
            //想要删除的元素前面的元素
            if (i < index) {
                newArr[i] = elements[i];
            }else {   //想要删除的元素后面的元素
                newArr[i] = elements[i + 1];
            }
        }
        //新数组替换旧数组
        elements = newArr;
    }

    //取出指定位置的元素
    public int get(int index) {
        if (index < 0 || index > elements.length-1) {
            //判断下标是否越界
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    //如何插入一个元素到指定位置
    public void insert(int index,int element) {
        //创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        //将原数组中的元素放入新数组中
        for (int i = 0;i < elements.length;i++) {
            //目标位置之前的元素
            if (i < index) {
                newArr[i] = elements[i];
            }else {      //目标位置之后的元素
                newArr[i + 1] = elements[i];
            }
        }
        //插入新的元素
        newArr[index] = element;
        //新数组替换旧数组
        elements = newArr;
    }

    //替换指定位置的元素
    public void set(int index,int element) {
        if (index < 0 || index > elements.length-1) {
            //判断下标是否越界
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }
}
























