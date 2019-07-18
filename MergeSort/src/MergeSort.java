import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/7/18 下午 4:58
 * @Version 1.0
 * @Project: 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9,3,7,2,4,6,88,10,29,65,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // 归并排序
    public static void mergeSort(int[] arr,int low,int high) {
        int mid = (high + low) / 2;
        if (low < high) {
            // 处理左边
            mergeSort(arr,low,mid);
            // 处理右边
            mergeSort(arr,mid+1,high);
            // 归并
            merge(arr,low,mid,high);
        }
    }

    private static void merge(int[] arr,int low,int mid,int high) {
        // 用于存储归并后的临时数组
        int[] temp = new int[high-low+1];
        // 记录第一个数组中需要遍历的下标
        int i = low;
        // 记录第二个数组中需要遍历的下标
        int j = mid + 1;
        // 用于记录在临时数组中存放的下标
        int index = 0;
        // 遍历两个数组取出小的数字，放入临时数组中
        while (i <= mid && j <= high) {
            // 第一个数组的数据更小
            if (arr[i] <= arr[j]) {
                // 把小的数据放入临时数组中
                temp[index] = arr[i];
                i++; // 让下标向后移一位
            }else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        // 处理多余的数据
        while (j <= high) {
            temp[index] = arr[j];
            j++;
            index++;
        }
        while (i <= mid) {
            temp[index] = arr[i];
            i++;
            index++;
        }
        // 把临时数组中的数据重新存入原数组
        for (int k = 0;k < temp.length;k++) {
            arr[k + low] = temp[k];
        }
    }
}
