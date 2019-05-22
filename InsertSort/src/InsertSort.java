import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/3/14 20:02
 * @Version 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,3,2,8,5,9,1,0};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //插入排序
    public static void insertSort(int[] arr) {
     if (arr.length <= 1) {
         return;
     }else {
         int n = arr.length;
         //遍历所有的数字
         //如果当前数字比前一个数字小
         for (int i = 1;i < n;i++)
             if (arr[i] < arr[i - 1]) {
                 //把当前遍历数字存起来
                 int temp = arr[i];
                 int j;
                 //遍历当前数字前面所有的数字
                 for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                     //把前一个数字赋给后一个数字
                     arr[j + 1] = arr[j];
                 }
                 //把临时变量（外层for循环的当前元素）赋给不满条件的后一个元素
                 arr[j + 1] = temp;
             }
     }
    }
}
