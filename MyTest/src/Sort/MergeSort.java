package Sort;

import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/7/19 上午 9:26
 * @Version 1.0
 * @Project: 归并排序测试
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,7,9,65,6,4,0,8,5,10,12};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int low,int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(arr,low,mid);
            mergeSort(arr,mid + 1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int[] arr,int low,int mid,int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int index = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[index] = arr[i];
                i++;
            }else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
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
        for (int k = 0;k < temp.length;k++) {
            arr[k + low] = temp[k];
        }
    }
}
