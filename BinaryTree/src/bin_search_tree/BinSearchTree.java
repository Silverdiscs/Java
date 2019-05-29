package bin_search_tree;

import bin_tree.BinTree;

/**
 * @Author: CX
 * @Date: 2019/5/29 上午 8:48
 * @Version 1.0
 * @Project: 二分搜索树
 */
public class BinSearchTree<E extends Comparable<E>> implements BinTree<E> {
    // Node类的声明
    private class Node {
        E data;
        Node left;
        Node right;
        public Node(E data) {
            this.data = data;
        }
    }

    private Node root; // 根节点

    private int size; // 二叉树节点个数

    @Override
    public void add(E e) {
        if (root == null) { //此时根节点为空
            Node node = new Node(e); // 于是把新加入的节点置为根节点
            root = node;
            size++;
        }
        // 递归的寻找插入位置
        add(root,e);
    }

    /**
     * 以指定的 node为根节点，插入指定元素 e
     * @param node
     * @param e
     */
    private void add(Node node,E e) {
        // 插入的值刚好是当前树根节点的值
        if (node.data.compareTo(e) == 0) {
            return;
        }
        // 找到插入位置，并且左子树为空，那么在左子树插入
        else if (e.compareTo(node.data) < 0 && node.left == null) {
            Node newNode = new Node(e);
            node.left = newNode;
            size++;
        }
        // 找到插入位置，并且右子树为空，那么在右子树插入
        else if (e.compareTo(node.data) > 0 && node.right == null) {
            Node newNode = new Node(e);
            node.right = newNode;
            size++;
        }
        else if (e.compareTo(node.data) < 0) {
            // 递归寻找左树插入位置
            add(node.left,e);
        }
        else {
            // 递归寻找右树插入位置
            add(node.right,e);
        }
    }

    @Override
    public boolean contains(E e) {
        if (root == null) { // 说明该二叉树为空
            return false;
        }
        // 以根节点开始递归查找元素
        return contains(root,e);
    }

    private boolean contains(Node node,E e) {
        // 终止条件
        if (node == null) {  // 当树为空，返回false
            return false;
        }
        if (node.data.equals(e)) {  // 当传入的节点恰好等于当前节点，返回 true
            return true;
        }
        else if (e.compareTo(node.data) < 0) {
            return contains(node.left,e);
        }
        else {
            return contains(node.right,e);
        }
    }

    @Override
    public void preOrder() {

    }

    @Override
    public void inOrder() {

    }

    @Override
    public void postOrder() {

    }

    @Override
    public E getMin() {
        return null;
    }

    @Override
    public E getMax() {
        return null;
    }

    @Override
    public E removeMin() {
        return null;
    }

    @Override
    public E removeMax() {
        return null;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
