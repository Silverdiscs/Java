package OJ;

/**
 * @Author: CX
 * @Date: 2019/6/2 上午 10:05
 * @Version 1.0
 * @Project: #104 二叉树的最大深度
 */
public class maxDepth {

    /**
     * 返回以 root 作为根节点的二叉树最大深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 求出当前二叉树子树的最大深度
        int maxDepth = Math.max(maxDepth(root.left),maxDepth(root.right));
        return maxDepth + 1;
    }
}
