package bin_search_tree;

import bin_tree.BinTree;

/**
 * @Author: CX
 * @Date: 2019/7/19 上午 11:03
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
    private int size; // 二叉树节点的个数

    //------------------------------------------------------------------

    @Override
    public void add(E e) {
        root = add(root,e);
    }

    /**
     * 以当前 node 作为根节点，插入元素为 e 的节点
     * 返回插入后的树的根节点
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
        // 判断此时 e 到底在左树还是在右树
        if (e.compareTo(node.data) < 0) {
            node.left = add(node.left,e);
        }
        if (e.compareTo(node.data) > 0) {
            node.right = add(node.right,e);
        }
        return node;
    }

    //------------------------------------------------------------------

    @Override
    public boolean contains(E e) {
        if (root == null) {
            return false;
        }
        // 以根节点开始递归查找元素
        return contains(root,e);
    }

    private boolean contains(Node node,E e) {
        // 终止条件
        if (node == null) {
            return false; // 树为空
        }
        if (node.data.equals(e)) {
            return true;
        }
        else if (e.compareTo(node.data) < 0) {
            return contains(node.left,e);
        }
        else {
            return contains(node.right,e);
        }
    }
    //------------------------------------------------------------------
    @Override
    public void preOrder() {
        preOrder(root);
    }

    /**
     * 以当前节点为根节点进行 前序遍历 根、左、右
     * @param node
     */
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    //------------------------------------------------------------------
    @Override
    public void inOrder() {
        inOrder(root);
    }

    /**
     * 以node为根节点进行 中序遍历 左、根、右
     * @param node
     */
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    //------------------------------------------------------------------
    @Override
    public void postOrder() {
        postOrder(root);
    }

    /**
     * 以node 根节点进行后序遍历 左、右、根
     * @param node
     */
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
    //------------------------------------------------------------------

    @Override
    public E getMin() {
        if (root == null) {
            throw new IllegalArgumentException("BST is empty!");
        }
        Node minNode = getMinNode(root);
        return minNode.data;
    }

    /**
     * 查找以 node 为根节点的二分搜索树的最小值节点
     * @param node
     * @return
     */
    private Node getMinNode(Node node) {
        if (node.left == null) {
            return node;
        }
        return getMinNode(node.left);
    }

    //------------------------------------------------------------------

    @Override
    public E getMax() {
        if (root == null) {
            throw new IllegalArgumentException("BST is empty!");
        }
        Node maxNode = getMaxNode(root);
        return maxNode.data;
    }

    /**
     * 查找以 node 为根节点的二分搜索树的最大值节点
     * @param node
     * @return
     */
    private Node getMaxNode(Node node) {
        if (node.right == null) {
            return node;
        }
        return getMaxNode(node.right);
    }
    //------------------------------------------------------------------

    @Override
    public E removeMin() {
        E result = getMin();
        root = removeMinNode(root);
        return result;
    }

    /**
     * 删除传入二叉树的最小值节点
     * 返回删除后二叉树的根节点
     * @param node
     * @return
     */
    private Node removeMinNode(Node node) {
        // 找到需要删除的节点
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        // 继续向左走，直到找到要删除的最小值节点
        // 删完之后，把后续的节点链接到原来的树上去
        node.left = removeMinNode(node.left);
        return node;
    }

    //------------------------------------------------------------------

    @Override
    public E removeMax() {
        E result = getMax();
        root = removeMaxNode(root);
        return result;
    }

    /**
     * 删除传入二叉树的最大值节点
     * @param node
     * @return
     */
    private Node removeMaxNode(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }
        node.right = removeMinNode(node.right);
        return node;
    }
    //------------------------------------------------------------------

    @Override
    public void remove(E e) {
        root = remove(root,e);
    }

    private Node remove(Node node,E e) {
        if (node == null) {
            return null;
        }
        if (e.compareTo(node.data) < 0) {
            node.left = remove(node.left, e);
        }
        if (e.compareTo(node.data) > 0) {
            node.right = remove(node.right, e);
        } else {
            if (node.left != null && node.right == null) {
                Node leftNode = node.left;
                size--;
                node.left = null;
                return leftNode;
            }
            if (node.right != null && node.left == null) {
                Node rightNode = node.right;
                size--;
                node.right = null;
                return rightNode;
            }
            if (node.left != null && node.right != null) {
                // 找到前驱或后继节点（这里选用后继节点）
                Node successor = getMinNode(node.right);
                successor.left = node.left;
                successor.right = removeMinNode(node.right);
                node.left = node.right = null;
                return successor;
            }
        }
        return node;
    }
    //------------------------------------------------------------------

    @Override
    public int size() {
        return size;
    }

    //------------------------------------------------------------------
}
