package DoubleNode;

/**
 * @Author: CX
 * @Date: 2019/8/22 下午 4:39
 * @Version 1.0
 * @Project: 双向循环链表
 */

public class DoubleNode {
    DoubleNode pre = this;  // 上一个节点
    DoubleNode next = this;  // 下一个节点
    int data;  // 节点数据
    public DoubleNode(int data) {
        this.data = data;
    }

    // 增加节点
    public void after(DoubleNode node) {
        DoubleNode nextNext = next;  // 原来的下一个节点
        this.next = node;  // 把新节点作为当前节点的下一个节点
        node.pre = this;  // 把当前节点做新节点的前一个节点
        node.next = nextNext;  // 让原来的下一个节点做新节点的下一个节点
        nextNext.pre = node;  // 让原来的下一个节点的上一个节点为新节点
    }

    // 下一个节点
    public DoubleNode next() {
        return this.next;
    }

    // 上一个节点
    public DoubleNode pre() {
        return this.pre;
    }

    // 获取数据
    public int getData() {
        return this.data;
    }
}
