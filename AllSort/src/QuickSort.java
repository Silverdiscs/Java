import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/7/22 上午 9:20
 * @Version 1.0
 * @Project: 快速排序
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,8,1,2,7,5,9,6,0,4};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int start,int end) {
        if (start < end) {
            // 把数组中的第 0个数字作为标准数
            int stard = arr[start];
            // 记录需要排序的下标
            int low = start;
            int high = end;
            // 循环查找 比标准数大的数和比标准数小的数
            while (low < high) {
                // 右边的数字比标准数大
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                // 使用右边的数字替换左边的数字
                arr[low] = arr[high];
                // 如果左边的数字比标准数小
                while (low < high && arr[low] <= stard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            // 标准数赋给低所在的位置的元素
            arr[low] = stard;
            // 处理所有小的数字
            quickSort(arr,start,low);
            // 处理所有大的数字
            quickSort(arr,low+1,end);
        }
    }
}
