package Sort;

import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/7/21 下午 3:29
 * @Version 1.0
 * @Project: 希尔排序
 */

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,1,2,4,8,9,7,6,0};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        long start = System.currentTimeMillis();
        int k = 1;
        // 遍历所有步长
        for (int d = arr.length / 2;d > 0;d /= 2) {
            // 遍历所有的元素
            for (int i = 0;i <arr.length;i++) {
                // 遍历本组中所有的元素
                for (int j = i - d; j >= 0; j -= d) {
                    // 如果当前元素大于加上步长后的那个元素
                    if (arr[j] > arr[j+d]) {
                        int temp = arr[j];
                        arr[j] = arr[j+d];
                        arr[j+d] = temp;
                    }
                }
            }
            System.out.println("第" + k + "次排序结果" + Arrays.toString(arr));
            k++;
        }
        long end = System.currentTimeMillis();
        System.out.println("希尔排序共耗时：" + (end-start) + "毫秒");
    }
}
