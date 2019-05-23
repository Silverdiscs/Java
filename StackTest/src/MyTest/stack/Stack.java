package MyTest.stack;

/**
 * @Author: CX
 * @Date: 2019/5/23 上午 9:03
 * @Version 1.0
 */
public interface Stack<T> {
    /**
     * 入栈
     * @param t
     * @return
     */
    boolean push(T t);

    /**
     * 出栈
     * @return
     */
    T pop();

    /**
     * 返回栈顶元素，但不出栈
     * @return
     */
    T peek();

    /**
     * 当前元素的个数
     * @return
     */
    int getSize();

    /**
     * 栈是否为空
     * @return
     */
    boolean isEmpty();
}
