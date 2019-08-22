package LoopNode;

/**
 * @Author: CX
 * @Date: 2019/8/22 上午 10:54
 * @Version 1.0
 * @Project: 循环链表测试
 */

public class TestLoopNode {
    public static void main(String[] args) {
        LoopNode n1 = new LoopNode(1);
        LoopNode n2 = new LoopNode(2);
        LoopNode n3 = new LoopNode(3);
        LoopNode n4 = new LoopNode(4);
        n1.after(n2);  // 增加节点
        n2.after(n3);  // 增加节点
        n3.after(n4);  // 增加节点
        System.out.println(n1.next().getData());
        System.out.println(n2.next().getData());
        System.out.println(n3.next().getData());
        System.out.println(n4.next().getData());
    }
}
