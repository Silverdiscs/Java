package bin_tree;

/**
 * @Author: CX
 * @Date: 2019/6/5 上午 9:35
 * @Version 1.0
 * @Project: 二叉树的通用接口
 */
public interface BinTree<E> {
    void add(E e); // 向二叉树中添加元素
    boolean contains(E e); // 查看二叉树中是否包含某个元素

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
     * 删除最小值
     * @return
     */
    E removeMin();

    /**
     * 删除最大值
     * @return
     */
    E removeMax();

    /**
     * 移除二叉树中指定值的节点
     * @param e
     */
    void remove(E e);

    /**
     * 取得节点个数
     * @return
     */
    int size();
}
