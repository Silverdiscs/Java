package MyTest.stack.impl;

import MyTest.stack.Stack;

import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/5/23 上午 9:08
 * @Version 1.0
 * @Project: 基于数组实现栈 —— 顺序栈
 */

public class ArrayStack<T> implements Stack<T> {
    // 存放数据
    private Object[] elementData;
    // 最多存放的元素个数
    private int maxSize;
    // 当前栈中的元素个数
    private int currentSize;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        elementData = new Object[maxSize];
    }

    @Override
    public boolean push(T t) {
        if (currentSize == maxSize) {  // 栈已满
            // 动态扩容
            int oldSize = maxSize;
            int newSize = oldSize << 1;
            if (newSize + 8 > Integer.MAX_VALUE) {
                System.err.println("栈太大！");
                return false;
            }
            maxSize = newSize;
            elementData = Arrays.copyOf(elementData,maxSize);
//            System.err.println("栈已满，无法放置新的元素！");  // 数组扩容前
//            return false;                                    // 数组扩容前
        }
        elementData[currentSize++] = t;
        return true;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.err.println("栈为空");
            return  null;
        }
        return (T) elementData[--currentSize];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.err.println("栈为空");
            return  null;
        }
        return (T) elementData[currentSize - 1];
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }
}
