package StackTest;

import java.util.Stack;
// 包装类的比较用 equals ！！！

/**
 * @Author: CX
 * @Date: 2019/5/24 下午 9:50
 * @Version 1.0
 * @Project: https://leetcode-cn.com/problems/min-stack/  最小栈的两种解法（双栈 & 单栈）
 */

// 双栈解法（隐式）
/*class MinStack {
    // 存放具体数值的栈
    private Stack<Integer> dataStack;
    // 存放栈的最小元素
    private Stack<Integer> minStack;

    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        dataStack.push(x);
    }

    public void pop() {
        // 包装类的比较用 equals ！！！
        if (dataStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}*/


// -------------------------------------------------------------------

// 单栈解法
/*
使用一个栈既要存放数据又要知道当前栈的最小值
元素 A： 具体的数据
元素 B： 最小值
*/

class MinStack {

    private Stack<Integer> stack = new Stack<>();

    public MinStack() {}

    // -2 0 -3
    // -2 -2   0 -2   -3 -3
    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            stack.push(x);
        }else {
            int temp = stack.peek();
            stack.push(x);
            if (x < temp) {
                stack.push(x);
            }else {
                stack.push(temp);
            }
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        int temp = stack.pop();
        int result = stack.peek();
        stack.push(temp);
        return result;
    }

    public int getMin() {
        return stack.peek();
    }
}

// -------------------------------------------------------------------

public class Test {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
