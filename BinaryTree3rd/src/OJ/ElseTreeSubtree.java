package OJ;

/**
 * @Author: CX
 * @Date: 2019/6/3 下午 2:41
 * @Version 1.0
 * @Project: #572  判断另一个树的子树  递归实现
 * @Description： 另一棵树的子树 = 查找二叉树中指定值的节点 + 判断两颗二叉树是否完全相同
 */

public class ElseTreeSubtree {
    /**
     * 首先，找到 t 的根节点在 s 中的位置
     * 然后，判断两颗二叉树是否相同
     * @param s
     * @param t
     * @return
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // 找到 s 中根节点值也为 t 的子节点
        boolean flag = false;
        // 递归出口条件
        if (s != null) {
            // 找到 s 中值与 t 的根节点相同的子节点
            if (s.val == t.val) {
                flag = isSameTree(s,t);
            }
            // 此时 s != t (此时 s 还未遍历完)
            // 那么递归的从 s 的子树中继续寻找与 t 的根节点相同的节点
            if (!flag) {
                flag = isSubtree(s.left,t) || isSubtree(s.right,t);
            }
        }
        return flag;
    }

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
