package Sort;

import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/7/19 上午 9:02
 * @Version 1.0
 * @Project: 选择排序测试
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,4,5,7,1,2,0,3,6,9};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        long start = System.currentTimeMillis();
        int n = arr.length;
        if (n <= 1) {
            return;
        }else {
            for (int i = 0;i < n-1;i++) {
                int minIndex = i;
                for (int j = i + 1;j < n;j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("选择排序共耗时：" + (end-start) +"毫秒");
    }
}

