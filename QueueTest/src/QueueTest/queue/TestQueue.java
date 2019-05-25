package QueueTest.queue;

import QueueTest.queue.impl.LinkedQueue;

/**
 * @Author: CX
 * @Date: 2019/5/25 下午 9:03
 * @Version 1.0
 * @Project:
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedQueue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println(queue.peek());
        System.out.println(queue.deQueue());
        System.out.println(queue.getSize());
        System.out.println(queue.peek());
    }
}
