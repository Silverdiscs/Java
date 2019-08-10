import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/7/21 下午 4:30
 * @Version 1.0
 * @Project: 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2,1,4,9,6,0,3,7,3,5,8};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        long start = System.currentTimeMillis();
        int n = arr.length;
        if (n <= 1) {
            return;
        }else {
            // 控制共比较多少轮
            for (int i = 0; i < n-1;i++) {
                boolean flag = false;
                for (int j = 0;j < n-1-i;j++) {
                    if (arr[j] > arr[j+1]) {
                        flag = true;
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                if (!flag)
                    break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序共耗时：" + (end-start) + "毫秒");
    }
}
