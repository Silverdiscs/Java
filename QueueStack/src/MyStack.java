import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: CX
 * @Date: 2019/5/28 下午 4:54
 * @Version 1.0
 * @Project: 用队列实现栈 LeetCode #225
 */

/*
使用队列实现栈的下列操作：

push(x) -- 元素 x 入栈
pop() -- 移除栈顶元素
top() -- 获取栈顶元素
empty() -- 返回栈是否为空

注意:

1. 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
2. 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
3. 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
*/

// 双队列解法
class MyStack {
    private Queue<Integer> queueA = new LinkedList<>();
    private Queue<Integer> queueB = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        // 保证所有元素都在一个队列中
        if (queueA.isEmpty()) {
            queueB.add(x);
        }else {
            queueA.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (queueA.isEmpty()) {
            int len = queueB.size();
            for (int i = 0; i < len - 1; i++) {
                // 所有元素依次放入队列 A中
                queueA.add(queueB.poll());
            }
            // 队列 B的最后一个元素一定是最后进入的
            // 刚好是栈的栈顶元素
            int result = queueB.poll();
            return result;
        }
        else {
            int len = queueA.size();
            for (int i = 0; i < len - 1; i++) {
                // 所有元素依次放入队列 B中
                queueB.add(queueA.poll());
            }
            // 队列 A的最后一个元素一定是最后进入的
            // 刚好是栈的栈顶元素
            int result = queueA.poll();
            return result;
        }
    }

    /** Get the top element. */
    public int top() {
        if (queueA.isEmpty()) {
            int len = queueB.size();
            for (int i = 0; i < len - 1; i++) {
                // 所有元素依次放入队列 A中
                queueA.add(queueB.poll());
            }
            // 队列 B的最后一个元素一定是最后进入的
            // 刚好是栈的栈顶元素
            int result = queueB.poll();
            queueA.add(result);
            return result;
        }
        else {
            int len = queueA.size();
            for (int i = 0; i < len - 1; i++) {
                // 所有元素依次放入队列 B中
                queueB.add(queueA.poll());
            }
            // 队列 A的最后一个元素一定是最后进入的
            // 刚好是栈的栈顶元素
            int result = queueA.poll();
            queueB.add(result);
            return result;
        }
    }

    /** Returns whether the stack is empty. */
    // 两个队列同时为空
    public boolean empty() {
        return queueA.isEmpty() && queueB.isEmpty();
    }
}


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */