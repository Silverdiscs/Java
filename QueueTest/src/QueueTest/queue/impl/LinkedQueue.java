package QueueTest.queue.impl;

import QueueTest.queue.Queue;

/**
 * @Author: CX
 * @Date: 2019/5/25 下午 8:41
 * @Version 1.0
 * @Project: 基于链表实现
 */

public class LinkedQueue<E> implements Queue<E> {
    private Node head; // 当前队列的头结点
    private Node tail; // 当前队列的尾结点，用于元素的入队
    private int size;  // 当前队列的长度

    private class Node {
        private E data;
        private Node next;
        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public void enQueue(E e) {
        Node newNode = new Node(e,null);
        // 当前队列为空
        if (head == null) {
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E deQueue() {
        if (isEmpty()) {
            System.err.println("队列为空！");
            return null;
        }
        E result = head.data;
        head.data = null;
        head = head.next;
        size--;
        return result;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            System.err.println("队列为空！");
            return null;
        }
        return head.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
