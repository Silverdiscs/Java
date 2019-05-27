给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

1. 左括号必须用相同类型的右括号闭合
2. 左括号必须以正确的顺序闭合
注意空字符串可被认为是有效字符串

参考leetcode-cn.com   第20题  有效的括号

地址： https://leetcode-cn.com/problems/valid-parentheses/description/


实现思路：

{  [  (  )  ]  }

1、依次遍历字符串，只要是{  [  (  都把它压入栈中

2、如果是  )   ]    }    则先后判断栈顶元素是否为(  ，
如果是则匹配成功，栈顶中  (  出栈，不是则返回false，不匹配

3、判断栈顶元素是否为 ] ，如果是则匹配成功，栈顶中  '['  出栈

4、判断栈顶元素是否为 } ，如果是则匹配成功，栈顶中  '{'  出栈

5、判断栈中是否还存在元素，如果不存在则表示之前已经全部匹配出栈，
如果还存在则表示部分未匹配，判断依据:stack.isEmpty()


代码 ————

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        //  声明一个stack
        Stack<Character> stack = new Stack<Character>();
        //  遍历s String本质上是char[]
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c=='('){
                //  如果是{ [ (   压入栈中
                stack.push(c);
            }else{
                //  }  ]  )   进行比对
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
        //  如果循环结束,栈中没有元素则表示全部匹配成功
        return stack.isEmpty();
    }
}