package OJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: CX
 * @Date: 2019/6/1 下午 5:20
 * @Version 1.0
 * @Project: 二叉树的前序遍历，#144 递归实现
 */

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}


public class SolutionPreOrder {
    List<Integer> list = new ArrayList<>();
    /**
     * 根据指定的根节点 root，返回其前序遍历结果
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) { // 当前根节点为空
            return Collections.emptyList();
        }
        list.add(root.val); // 当前节点不为空
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
