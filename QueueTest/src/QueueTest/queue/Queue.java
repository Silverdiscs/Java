package QueueTest.queue;

/**
 * @Author: CX
 * @Date: 2019/5/25 下午 8:34
 * @Version 1.0
 * @Project: 队列的实现
 */
public interface Queue<E> {
    /**
     * 入队
     * @param e 队尾插入
     */
    void enQueue(E e);

    /**
     * 出队
     * @return 队首元素
     */
    E deQueue();

    /**
     * 返回队首元素，但不出队
     * @return
     */
    E peek();

    /**
     * 返回长度
     * @return
     */
    int getSize();

    /**
     * 判断是否为空
     * @return
     */
    boolean isEmpty();
}
