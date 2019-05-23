package MyTest.stack;

import MyTest.stack.impl.ArrayStack;
import MyTest.stack.impl.LinkedStack;

/**
 * @Author: CX
 * @Date: 2019/5/23 上午 9:46
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(5);
//        Stack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
    }
}
