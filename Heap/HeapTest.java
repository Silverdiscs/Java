package heap;

import java.util.Random;

/**
 * @Author: CX
 * @Date: 2019/6/17 上午 9:52
 * @Version 1.0
 * @Project: 堆的测试
 */

/*public class HeapTest {
    public static void main(String[] args) {
        int[] nums = new int[]{62,41,30,28,16,22,13,19,17,15};
        Heap<Integer> heap = new Heap<>();
        for (int i : nums) {
            heap.add(i);
        }
        heap.add(52);
        heap.extractMax();
        System.out.println(heap);
    }
}*/

public class HeapTest {
    public static void main(String[] args) {
        int n = 1000000;
        Random random = new Random();
        Heap<Integer> heap = new Heap<>(n);
        for (int i = 0;i < n;i++) {
            heap.add(random.nextInt(Integer.MAX_VALUE));
        }
        int[] nums = new int[n];
        int i = 0;
        while (!heap.isEmpty())
            nums[i++] = heap.extractMax();
        for (int j = 1; j < n;j++) {
            if (nums[j - 1] < nums[j])
                throw new IllegalArgumentException("Error");
        }
        System.out.println("Test Completed!");
    }
}
