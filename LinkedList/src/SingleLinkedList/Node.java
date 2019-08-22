package SingleLinkedList;

/**
 * @Author: CX
 * @Date: 2019/8/22 上午 9:14
 * @Version 1.0
 * @Project: 单链表
 */

// 一个节点
public class Node {
    // 节点内容
    int data;
    // 下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    // 为节点追加节点
    public Node append(Node node) {
        Node currentNode = this;  // 当前节点
        while (true) {  // 循环向后找
            Node nextNode = currentNode.next;  // 取出下一个节点
            // 如果下一个节点为null
            // 当前节点已经是最后一个节点
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;  // 赋给当前节点
        }
        // 把需要追回的节点追加为找到的当前节点的下一个节点
        currentNode.next =  node;
        return this;
    }

    // 删除下一个节点
    public void removeNext() {
        Node newNext = next.next;  // 取出下下一个节点
        this.next = newNext;  // 把下下一个节点设置为当前节点的下一个节点
    }

    // 插入一个节点,作为当前节点的下一个节点
    public void after(Node node) {
        Node nextNext = next;  // 取出下一个节点，作为下下一个节点
        this.next = node;  // 把新节点作为当前节点的下一个节点
        node.next = nextNext;  // 把下下一个节点设置为新节点的下一个节点
    }

    // 显示所有节点信息
    public void show() {
        Node currentNode = this;
        while (true) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;  // 取出下一个节点
            // 如果是最后一个节点
            if (currentNode == null) {
                break;
            }
        }
        System.out.println();
    }

    // 获取下一个节点
    public Node next() {
        return this.next;
    }

    // 获取节点中的数据
    public int getData() {
        return this.data;
    }

    // 当前节点是否为最后一个节点
    public boolean isLast() {
        return next == null;
    }
}

