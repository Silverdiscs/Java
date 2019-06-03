package OJ;

/**
 * @Author: CX
 * @Date: 2019/6/1 下午 6:53
 * @Version 1.0
 * @Project: #606 根据二叉树创建字符串 递归实现
 */
public class SolutionString {
    public String tree2str(TreeNode t) {
        StringBuilder res = new StringBuilder();
        tree2str(t,res);
        return res.toString();
    }

    /**
     * 以当前 node 为根节点进行前序遍历
     * @param node
     * @param res
     */
    private void tree2str(TreeNode node,StringBuilder res) {
        if (node == null) {
            return;
        }
        res.append(node.val);
        if (node.left != null) {
            res.append("(");
            tree2str(node.left,res);
            res.append(")");
        }else {
            // 此时左子树为空，同时右子树不为空
            if (node.right != null) {
                res.append("()");
            }
        }
        if (node.right != null) {
            res.append("(");
            tree2str(node.right,res);
            res.append(")");
        }
    }
}