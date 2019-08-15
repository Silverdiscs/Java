package Previous;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 8, 1, 2, 7, 5, 9, 6, 0, 4 };
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        int high = end;
        int low = start;
        int stand = arr[start];
        if (start < end) {
            while (low < high) {
                while (low < high && arr[high] >= stand) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low] <= stand) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stand;
            quickSort(arr, start, low);
            quickSort(arr, low + 1, end);
        }
    }
}
