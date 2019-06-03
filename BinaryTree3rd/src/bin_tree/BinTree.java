package bin_tree;

/**
 * @Author: CX
 * @Date: 2019/5/29 上午 8:37
 * @Version 1.0
 * @Project: 二叉树的通用接口
 */
public interface BinTree<E> {
    void add(E e);
    boolean contains(E e);

    /**
     * 前序遍历
     */
    void preOrder();

    /**
     * 中序遍历
     */
    void inOrder();

    /**
     * 后序遍历
     */
    void postOrder();

    /**
     * 取得最小值
     * @return
     */
    E getMin();

    /**
     * 取得最大值
     * @return
     */
    E getMax();

    /**
     * 移除最小值
     * @return
     */
    E removeMin();

    /**
     * 移除最大值
     * @return
     */
    E removeMax();

    /**
     * 移除二叉树中指定值的节点
     * @param e
     * @return
     */
    void remove(E e);

    /**
     * 取得节点个数
     * @return
     */
    int size();

}
