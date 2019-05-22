/**
 * @Author: CX
 * @Date: 2019/3/13 10:56
 * @Version 1.0
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        //目标数组
        int[] data = new int[]{1,3,5,7,8,9};
        //目标元素
        int target = 3;
        //目标元素所在的下标
        int index = -1;
        //遍历数组
        for (int i = 0;i < data.length;i++) {
            if (target == data[i]) {
                index = i;
                break;
            }
        }
        System.out.println("index: " + index );
    }
}








