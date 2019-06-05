package BST;

import bin_tree.BinTree;

/**
 * @Author: CX
 * @Date: 2019/6/5 上午 9:45
 * @Version 1.0
 * @Project: 二分搜索树
 */
public class BinSearchTree<E extends Comparable<E>> implements BinTree<E> {
    private class Node {
        E data;
        Node left;
        Node right;
        public Node(E data) {
            this.data = data;
        }
    }

    private Node root;
    private int size;

    //*********************  给二叉搜索树中添加一个元素  ******************

    @Override
    public void add(E e) {
        root = add(root,e);
    }

    /**
     * 以当前 node 作为根节点，插入元素为 e 的节点
     * 返回插入后的树的节点
     * @param node
     * @param e
     * @return
     */
    private Node add(Node node,E e) {
        if (node == null) {
            Node newNode = new Node(e);
            size++;
            return newNode;
        }
        if (e.compareTo(node.data) < 0) {
            node.left = add(node.left,e);
        }
        if (e.compareTo(node.data) > 0) {
            node.right = add(node.right,e);
        }
        return node;
    }

    //********************************************************************

    @Override
    public boolean contains(E e) {
        return false;
    }

    //**************************   前序遍历   ****************************

    @Override
    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    //**************************   中序遍历   ****************************

    @Override
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    //**************************   后序遍历   ****************************

    @Override
    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    //*************************   获取最小值  ***************************

    @Override
    public E getMin() {
        if (root == null)
            throw new IllegalArgumentException("BST is empty");
        Node minNode = getMinNode(root);
        return minNode.data;
    }
    private Node getMinNode(Node node) {
        if (node.left == null) {
            return node;
        }
        return getMinNode(node.left);
    }

    //*************************   获取最大值  ***************************

    @Override
    public E getMax() {
        if (root == null)
            throw new IllegalArgumentException("BST is empty!");
        Node maxNode = getMaxNode(root);
        return maxNode.data;
    }
    private Node getMaxNode(Node node) {
        if (node.right == null) {
            return node;
        }
        return getMaxNode(node.right);
    }

    //*************************   删除最小值  ***************************

    @Override
    public E removeMin() {
        E result = getMin();
        root = removeMinNode(root);
        return result;
    }
    private Node removeMinNode(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMinNode(node.left);
        return node;
    }

    //*************************   删除最大值  ***************************

    @Override
    public E removeMax() {
        return null;
    }

    //*******************************************************************

    @Override
    public void remove(E e) {

    }

    @Override
    public int size() {
        return size;
    }
}
