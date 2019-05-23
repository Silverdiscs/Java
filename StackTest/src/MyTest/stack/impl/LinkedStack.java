package MyTest.stack.impl;

import MyTest.stack.Stack;

/**
 * @Author: CX
 * @Date: 2019/5/23 上午 9:51
 * @Version 1.0
 * @Project: 基于链表实现栈
 */
public class LinkedStack<T> implements Stack<T> {
    // 栈顶元素
    private Node top;
    private int currentSize;
    private class Node {
        private T t;
        private Node next;
        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }
    }

    @Override
    public boolean push(T t) {
        // 创建新节点
        Node newNode = new Node(t,null);
        if (top == null) {
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        currentSize++;
        return true;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.err.println("当前栈为空！");
            return null;
        }
        T result = top.t; // 取回当前栈顶的元素
        top = top.next; // 维护当前 result —— 出栈时，把栈顶后面的元素重新设置为 top
        currentSize--;
        return result; // 将栈顶元素 pop出栈
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.err.println("当前栈为空！");
            return null;
        }
        return top.t;
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
