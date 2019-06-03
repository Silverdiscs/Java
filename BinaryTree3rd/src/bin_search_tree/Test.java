package bin_search_tree;

import bin_tree.BinTree;
import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: CX
 * @Date: 2019/5/29 上午 9:20
 * @Version 1.0
 * @Project: 二叉搜索树的方法测试
 */
public class Test {
    public static void main(String[] args) {
        BinTree<Integer> binTree = new BinSearchTree<>();
        int[] num = new int[] {28,16,13,22,30,29,42};
        for (int i = 0; i < num.length; i++) {
            binTree.add(num[i]);
        }
//        System.out.println();
//        binTree.preOrder();
//        System.out.println("==========");
//        System.out.println(binTree);
//        binTree.inOrder();
//        binTree.postOrder();
//        System.out.println(binTree.getMin());
//        System.out.println(binTree.getMax());
        List<Integer> list = new ArrayList<>();
        while (binTree.size() != 0) {
//            list.add(binTree.removeMin());
            list.add(binTree.removeMax());
        }
        System.out.println(list);
        System.out.println(binTree.size());
    }
}
