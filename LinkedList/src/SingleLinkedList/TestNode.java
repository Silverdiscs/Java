package SingleLinkedList;

/**
 * @Author: CX
 * @Date: 2019/8/22 上午 9:17
 * @Version 1.0
 * @Project: 单链表测试
 */

public class TestNode {
    public static void main(String[] args) {
        // 创建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.append(n2).append(n3).append(new Node(4));  // 追加节点
        // 取出下一个节点的数据
        System.out.println(n1.next().next().next().getData());
        System.out.println(n1.isLast());  // 判断节点是否为最后一个节点
        n1.show();  // 显示所有节点内容
//        n1.next().removeNext();  // 删除一个节点(删除n3)
//        n1.show();  // 显示所有节点内容
        // 插入一个新节点
        Node node = new Node(5);
        n1.next().after(node);
        n1.show();
    }
}
