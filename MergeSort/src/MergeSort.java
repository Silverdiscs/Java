/**
 * @Author: CX
 * @Date: 2019/3/22 9:36
 * @Version 1.0
 */
/*
public class MergeSort {

}
*/

public class TestDemo {
    public static void main(String[] args) {
        int[] data = new int[] {2,9,7,3,6,5,1,8,0,4};
        System.out.println(Arrays.toString(data));
        selectSort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void selectSort(int[] data) {
        int c = data.length;
        if (c <= 1) {
            return;
        }else {
            for (int i = 0; i < c; i++) {
                int minIndex = i;
                for (int j = i+1; j < c; j++) {
                    if (data[j] < data[minIndex]) {
                        minIndex = j;
                    }
                }
                if (i != minIndex) {
                    int temp = data[i];
                    data[i] = data[minIndex];
                    data[minIndex] = temp;
                }
            }
        }
    }
}