import java.util.Scanner;

/**
 * @Author: CX
 * @Date: 2019/8/4 上午 9:18
 * @Version 1.0
 * @Project: 回文数 LeetCode.9
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int num = x;
        int div = 1;
        // 计算 num的位数
        while (num / div >= 10) {
            div *= 10;
        }
        while (num != 0) {
            int left = num / div;
            int right = num % 10;
            if (left != right)
                return false;
            // 更新 num
            num = (num - left*div) / 10;
            // 上面已经减去最左边和最右边的数字了，
            // 所以位数相应的要小两位，即除100
            div /= 100;
        }
        return true;
    }
}
