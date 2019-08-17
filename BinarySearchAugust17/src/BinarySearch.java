/**
 * @Author: CX
 * @Date: 2019/8/17 下午 4:07
 * @Version 1.0
 * @Project: 二分查找
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int index = binarySearch(arr,target);
        if (index == -1) {
            System.out.println("查无此数");
        }else {
            System.out.println("该数索引位置：" + " " + index);
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;  // 记录开始位置
        int end = arr.length - 1;  // 记录结束位置
        int mid = (start + end) / 2;  // 记录中间位置
        int index = -1;
        while (end >= start) {  // 循环查找
            // 判断中间的这个元素是不是要查找的元素
            if (arr[mid] == target) {
                index = mid;
                break;
            }else {  // 中间这个元素不是要查找的元素
                // 判断中间这个元素是不是比目标元素要大
                if (arr[mid] > target) {
                    // 把结束位置调整到中间位置前一个位置
                    end = mid - 1;
                }else {
                    // 把开始位置调整到中间位置的后一个位置
                    start = mid + 1;
                }
                // 取出新的中间位置
                mid = (start + end) / 2;
            }
        }
        return index;
    }
}

// 递归比较耗费内存，
// 而循环（非递归），循环一次，内存就释放一次，占用空间较少