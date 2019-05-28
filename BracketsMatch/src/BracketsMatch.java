import java.util.Stack;

/**
 * @Author: CX
 * @Date: 2019/5/28 下午 3:20
 * @Version 1.0
 * @Project: 括号匹配问题 LeetCode —— #20 有效的括号
 */

/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

        有效字符串需满足：

        1. 左括号必须用相同类型的右括号闭合。
        2. 左括号必须以正确的顺序闭合。

        注意空字符串可被认为是有效字符串。*/

public class BracketsMatch {
    public boolean isValid(String s) {
        // str -> char[]  先变成一个括号的数组
        char[] data = s.toCharArray();
        Stack<Character> stack = new Stack<>(); // 创建栈结构
        // 遍历字符串序列
        for (char c : data) {
            // 碰到左括号入栈
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (c == '}') {
                    char temp = stack.peek();
                    if (temp == '{') {
                        stack.pop();
                        continue;
                    } else {
                        return false;
                    }
                }
                else if (c == ']') {
                    char temp = stack.peek();
                    if (temp == '[') {
                        stack.pop();
                        continue;
                    } else {
                        return false;
                    }
                }
                else if (c == ')') {
                    char temp = stack.peek();
                    if (temp == '(') {
                        stack.pop();
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
