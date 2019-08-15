package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2,1,4,9,6,0,7,3,5,8};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }else {
            for(int i = 0; i < n - 1; i++) {
                boolean flag = false;
                for(int j = 0; j < n-1-i; j++) {
                    if(arr[j] > arr[j+1]) {
                        flag = true;
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                if(!flag) {
                    break;
                }
            }
        }
    }
}