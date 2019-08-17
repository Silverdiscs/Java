/**
 * @Author: CX
 * @Date: 2019/8/17 下午 4:42
 * @Version 1.0
 * @Project: 二分查找 (递归实现)
 */

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        int target = 9;
        int index = binarySearch(arr,target,0,arr.length-1);
        if (index == -1) {
            System.out.println("查无此数");
        }else {
            System.out.println("该数索引位置：" + " " + index);
        }
    }

    private static int binarySearch(int[] arr, int target, int low, int high) {
        int mid = (low + high) / 2;  // 中间索引
        int data = arr[mid];  // 中间值
        if (high < low)
            return -1;
        if (data == target) {  // 中间值就是要找的 target
            return mid;
        }else {  // 中间值不是要找的 target
            if (data < target) {  // target 大于 中间值
                return binarySearch(arr, target, mid + 1, high);
            }else {  // target 小于 中间值
                return binarySearch(arr, target, low, mid - 1);
            }
        }
    }
}

// 递归比较耗费内存，
// 而循环（非递归），循环一次，内存就释放一次，占用空间较少