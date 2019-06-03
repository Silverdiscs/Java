package OJ;

/**
 * @Author: CX
 * @Date: 2019/6/2 上午 9:34
 * @Version 1.0
 * @Project: #100 相同的树 给定两个二叉树，编写一个函数来检验它们是否相同 （递归）
 * @Description： 结构上相同 && 节点具有相同的值
 */
public class SameTree {

    /**
     * 判断以 p 和 q为根节点的两颗二叉树是否完全相同
     * @param p
     * @param q
     * @return
     */

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) { // 当两树都为空
            return true;
        }
        if (p == null || q == null ) { // 当两树中只有其中一个为空
            return false;
        }
        if (p.val != q.val) { // 根节点都不相同
            return false;
        }
        // 此时两棵树根节点不为空，并且，根节点值相等
        // 此时去两颗二叉树的子树中去比较
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
