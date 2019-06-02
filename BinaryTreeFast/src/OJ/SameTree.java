package OJ;

/**
 * @Author: CX
 * @Date: 2019/6/2 上午 9:34
 * @Version 1.0
 * @Project: #100 相同的树 给定两个二叉树，编写一个函数来检验它们是否相同 （递归）
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null ) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
