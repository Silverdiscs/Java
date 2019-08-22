package LoopNode;

/**
 * @Author: CX
 * @Date: 2019/8/22 上午 10:47
 * @Version 1.0
 * @Project: 循环链表
 */

public class LoopNode {
    // 节点内容
    int data;
    // 下一个节点
    LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }

    // 插入一个节点作为当前节点的下一个节点
    public void after(LoopNode node) {
        LoopNode nextNext = next;  // 取出下一个节点，作为下下一个节点
        this.next = node;  // 把新节点作为当前节点的下一个节点
        node.next = nextNext;  // 把下下一个节点设置为新节点的下一个节点
    }

    // 获取下一个节点
    public LoopNode next() {
        return this.next;
    }

    // 获取节点中的数据
    public int getData() {
        return this.data;
    }
}
