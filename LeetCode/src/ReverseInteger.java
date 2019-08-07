/**
 * @Author: CX
 * @Date: 2019/8/6 下午 3:38
 * @Version 1.0
 * @Project: 整数反转 LeetCode.7
 */

public class ReverseInteger {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int newrev = rev * 10 + x % 10;
            // 检查是否出现 overflow
            if ((newrev - x % 10) / 10 != rev)
                return 0;
            rev = newrev;
            x /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(19960118));
    }
}
