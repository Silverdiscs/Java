import java.util.Stack;

/**
 * @Author: CX
 * @Date: 2019/8/7 上午 11:31
 * @Version 1.0
 * @Project: 有效的括号 LeetCode.20
 */

public class ValidParentheses {
    public static boolean isValid(String s) {
        //1、申明一个stack
        Stack<Character> stack = new Stack<Character>();
        //遍历 s String本质上是char[]
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);   // charAt --> 返回指定索引处的字符
            if(c == '{' || c == '[' || c == '('){
                //如果是{ [ (   压入栈中
                stack.push(c);
            }else{
                //  }  ]  )   进行比对
                // 判断此时栈是否为空
                if(stack.isEmpty()){
                    return false;
                }
                char topChar = stack.pop();
                if(c == ']' && topChar != '['){
                    return false;
                }
                if(c == '}' && topChar != '{'){
                    return false;
                }
                if(c == ')' && topChar != '('){
                    return false;
                }
            }
        }
        //如果循环结束,栈中没有元素则表示全部匹配成功
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}"));
    }
}
