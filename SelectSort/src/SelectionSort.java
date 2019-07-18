import com.sun.javafx.collections.SortHelper;

import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/7/18 上午 9:24
 * @Version 1.0
 * @Project: 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{3,4,5,7,1,2,0,3,6,9};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        long start = System.currentTimeMillis();
        int n = array.length;
        if (n <= 1) {
            return;
        }else {
            // 从未排序空间中选出最小值
            for (int i = 0;i < n - 1;i++) {
                int minIndex = i;
                for (int j = i + 1;j < n;j++) {
                    // 如果后面比较的数字比纪录的数字更小
                    if (array[j] < array[minIndex]) {
                        //记录下最小的那个数的下标
                        minIndex =  j;
                    }
                }
                //此时minIndex对应的元素一定是当前未排序区间的最小值
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("选择排序共耗时：" + (end-start) + "毫秒");
    }
}
