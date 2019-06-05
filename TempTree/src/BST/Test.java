package BST;

import bin_tree.BinTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: CX
 * @Date: 2019/6/5 上午 11:05
 * @Version 1.0
 * @Project: 测试
 */
public class Test {
    public static void main(String[] args) {
        BinTree<Integer> binTree = new BinSearchTree<>();
        int[] num = new int[] {28,16,13,22,30,29,42};
        for (int i = 0; i < num.length; i++) {
            binTree.add(num[i]);
        }
        List<Integer> list = new ArrayList<>();
        while (binTree.size() != 0) {
            list.add(binTree.removeMin());
        }
        System.out.println(list);
        System.out.println(binTree.size());
    }
}
