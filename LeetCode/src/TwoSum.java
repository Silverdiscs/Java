import java.util.HashMap;

/**
 * @Author: CX
 * @Date: 2019/8/4 上午 11:21
 * @Version 1.0
 * @Project: 两数之和 LeetCode.1
 * @Description： 使用 Map键值对，去寻找
 */

public class TwoSum {
    public int[] twoSum(int[] nums,int target) {
        int[] res = new int[2];
        if (nums == null || nums.length <= 1)
            return res;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // 从第一个数开始遍历
        for (int i = 0;i < nums.length;i++) {
            int num = nums[i];
            int val = target - num;  // 用 target减去目前的数
            // 如果 map中有 target减去当前数的那个数
            if (map.containsKey(val)) {
                // 把当前数num的下标，val的下标返回给 建立的数组 res
                res[0] = i;
                res[1] = map.get(val);
                return res;
            }
            // 表示当前 map中没有target减去当前数的那个数val，
            // 就把当前数 num和它的index添加到 map中
            else
                map.put(num,i);
        }
        return res;
    }
}
