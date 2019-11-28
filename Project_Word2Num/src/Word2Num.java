import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: CX
 * @Date: 2019/11/28 下午 2:49
 * @Version 1.0
 * @Project: 数字表示单词 —— 输入字母，显示出与之对应的数字（#Nokia九键）
 */

public class Word2Num {
    private static HashMap<Character, String> map = new HashMap<>();
    static {
        mPut("abc","2");
        mPut("def","3");
        mPut("ghi","4");
        mPut("jkl","5");
        mPut("mno","6");
        mPut("pqrs","7");
        mPut("tuv","8");
        mPut("wxyz","9");
    }

    /**
     * 封装一个可以让 HashMap连续 put好几个键值对的方法
     * @param num 手机上的数字键位
     * @param keys 键位上的所有字母
     * */
    private static void mPut(String keys, String num) {
        for (int i = 0; i < keys.length(); i++) {
            map.put(keys.charAt(i), num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- 请输入单词; 若要退出程序，请输入 /quit --------");
        String word = sc.nextLine().toLowerCase(); // 全部转成小写字母
        while (!word.equals("/quit")) {
            for (int i = 0; i < word.length(); i++) {
                String num = map.get(word.charAt(i));
                if (num == null) {
                    System.out.println("输入数据不合法!");
                    break;
                }
                System.out.print(num);
            }
            System.out.println();
            word = sc.nextLine().toLowerCase();
        }
        System.out.println("已退出");
    }
}
