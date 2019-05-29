package bin_search_tree;

import bin_tree.BinTree;

/**
 * @Author: CX
 * @Date: 2019/5/29 上午 9:20
 * @Version 1.0
 * @Project: 二叉搜索树的方法测试
 */
public class Test {
    public static void main(String[] args) {
        BinTree<Integer> binTree = new BinSearchTree<>();
        int[] num = new int[] {5,1,8,3,4,7,9};
        for (int i = 0; i < num.length; i++) {
            binTree.add(num[i]);
        }
        System.out.println(binTree.contains(7));
        System.out.println(binTree.contains(10));
    }
}
