package SumSort;
import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/8/18 下午 6:01
 * @Version 1.0
 * @Project: 排序总结: 快速、冒泡、插入、选择、希尔、归并
 */

public class SumSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2,1,5,8,9,4,3,7,6,0};
        System.out.println(Arrays.toString(arr));
//        quickSort(arr,0,arr.length-1);
//        bubbleSort(arr);
//        insertSort(arr);
//        selectSort(arr);
//        shellSort(arr);
//        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序
     * @param arr
     * @param start
     * @param end
     */
    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int low = start;
            int high = end;
            int stand = arr[start];
            while (low < high) {
                while (low < high && stand <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low] <= stand) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stand;
            quickSort(arr,start,low);
            quickSort(arr,low+1,end);
        }
    }

    /**
     * 冒泡排序
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }else {
            for (int i = 0; i < n-1; i++) {
                boolean flag = false;
                for (int j = 0; j < n-1-i; j++) {
                    if (arr[j+1] < arr[j]) {
                        flag = true;
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                if(!flag)
                    break;
            }
        }
    }

    /**
     * 插入排序
     * @param arr
     */
    private static void insertSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }else {
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i-1]) {
                    int temp = arr[i];
                    int j;
                    for (j = i-1; j >= 0 && arr[j] > temp; j--) {
                        arr[j+1] = arr[j];
                    }
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * @param arr
     */
    private static void selectSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }else {
            for (int i = 0; i < n-1; i++) {
                int minIndex = i;
                for (int j = i+1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    /**
     * 希尔排序
     * @param arr
     */
    private static void shellSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }else {
            for (int d = n/2; d > 0; d /= 2) {
                for (int i = d; i < n; i++) {
                    for (int j = i-d; j >= 0; j -= d) {
                        if (arr[j] > arr[j+d]) {
                            int temp = arr[j];
                            arr[j] = arr[j+d];
                            arr[j+d] = temp;
                        }
                    }
                }
            }
        }
    }

    /**
     * 归并排序
     * @param arr
     * @param low
     * @param high
     */
    private static void mergeSort(int[] arr, int low, int high) {
        int mid = (high + low) / 2;
        if (low < high) {
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
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
