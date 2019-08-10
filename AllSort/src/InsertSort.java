import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/7/22 上午 8:43
 * @Version 1.0
 * @Project: 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2,7,8,1,3,4,7,6,9,5,0};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }else {
            for (int i = 1;i < n;i++) {
                if (arr[i] < arr[i-1]) {
                    int temp = arr[i];
                    int j;
                    for (j = i-1;j >= 0 && arr[j] > temp;j--) {
                        arr[j+1] = arr[j];
                    }
                    // 把临时变量（外层 for循环的当前元素）赋给不满足条件的最后一个元素
                    arr[j+1] = temp;
                }
            }
        }
    }
}
