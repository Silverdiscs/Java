package heap;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: CX
 * @Date: 2019/6/9 上午 7:33
 * @Version 1.0
 * @Project: 基于数组实现的二叉堆
 */
public class Heap<E> {
    // 实现任意类的大小比较
    private Comparator<E> comparator;
    private int size;
    private E[] elementData;
    // 默认的初始容量
    private static final int DEFAULT_CAPACITY = 10;

    public Heap() {
        this(DEFAULT_CAPACITY,null);
    }

    public Heap(int initialCapacity) {
        this(initialCapacity,null);
    }

    public Heap(int initialCapacity,Comparator<E> comparator) {
        this.elementData = (E[]) new Object[initialCapacity];
        this.comparator = comparator;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 元素的添加
     * @param e
     */
    public void add(E e) {
        if (size == elementData.length) {
            // 需要扩容
            grow();
        }
        // 向数组末尾添加元素
        elementData[size++] = e;
        // siftUp
        siftUP(size - 1);
    }

    public E findMax() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Heap is empty!");
        return elementData[0];
    }

    public E extractMax() {
        E result = findMax();
        // 交换堆顶元素与最后一个元素的位置
        swap(0,size - 1);
        elementData[--size] = null;
        // siftDown
        siftDown(0);
        return result;
    }

    /**
     * 将二叉树当前节点下沉到正确位置
     * @param index
     */
    private void siftDown(int index) {
        while (leftChildIndex(index) < size) {
            // 当前节点左孩子的下标
            int j = leftChildIndex(index);
            // 判断是左孩子大还是右孩子大
            if (j + 1 < size) {
                // 此时有右孩子
                if (compare(elementData[j],elementData[j + 1]) < 0)
                    // j指向右孩子索引下表
                    j++;
            }
            // elementData[j] 一定是左右孩子的最大值
            if (compare(elementData[index],elementData[j]) > 0)
                break;
            swap(index,j);
            index = j;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (E e : elementData)
            if (e != null)
                res.append(e + "、");
        return res.toString();
    }

    /**
     * 调整当前节点在堆中的位置
     * @param index
     */
    private void siftUP(int index) {
        while (index > 0 && compare(elementData[index],
                elementData[parentIndex(index)]) > 0) {
            // 交换当前节点与父节点的值
            swap(index,parentIndex(index));
            index = parentIndex(index);
        }
    }
    private void swap(int indexA,int indexB) {
        E temp = elementData[indexA];
        elementData[indexA] = elementData[indexB];
        elementData[indexB] = temp;
    }

    /**
     * 数组的扩容
     */
    private void grow() {
        int oldCap = elementData.length;
        int newCap = oldCap + (oldCap < 64 ? oldCap : oldCap >> 1);
        if (newCap > Integer.MAX_VALUE - 8) {
            throw new IndexOutOfBoundsException("数组太大！");
        }
        elementData = Arrays.copyOf(elementData,newCap);
    }

    /**
     * 比较两个元素的大小
     * @param o1
     * @param o2
     * @return
     */
    private int compare(E o1,E o2) {
        if (comparator == null) {
            // 此时 E 必须为 Compareable 接口子类
            return ((Comparable<E>)o1).compareTo(o2);
        }
        return comparator.compare(o1,o2);
    }

    /**
     * 返回当前节点的左孩子节点下标
     * @param index
     * @return
     */
    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    /**
     * 取得当前节点的右孩子节点下标
     * @param index
     * @return
     */
    private int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    /**
     * 取得当前节点父节点的下标
     * @param index
     * @return
     */
    private int parentIndex(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("当前节点没有父节点");
        }
        return (index - 1) / 2;
    }
}
