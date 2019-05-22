import java.util.Arrays;

/**
 * @Author: CX
 * @Date: 2019/3/14 16:58
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {4,5,6,3,1,2};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    /**
     * 共需要比较 ： length - 1轮
     * @param arr
     */

    //原始冒泡
    /*public static void bubbleSort(int[] arr) {
        //控制共比较多少轮
        if (arr.length <= 1) {
            return;
        }else {
            int n = arr.length;
            for (int i = 0;i < n - 1;i++) {
                for (int j = 0;j < n - 1 - i;j++) {
                    //控制比较的次数
                    if (arr[j] > arr[j+1]) {
                       int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
  }*/


    //改进冒泡
    public static void bubbleSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }else {
            int n = arr.length;
            for (int i = 0;i < n - 1;i++) {
                boolean flag = false;
                for (int j = 0;j < n - i - 1;j++) {
                    if (arr[j] > arr[j + 1]) {
                        flag = true;
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                //此时已经没有数据交换，停止循环
                if (! flag) {
                    break;
                }
            }
        }
    }

}

