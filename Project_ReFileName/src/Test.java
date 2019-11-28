import java.io.File;

/**
 * @Author: CX
 * @Date: 2019/11/28 上午 9:56
 * @Version 1.0
 * @Project: Java重命名文件
 */

public class Test {
    private static boolean rename(String newName) {
        // 旧的文件
        File file = new File("peach.txt");
        // 新的文件名
        File fileNew = new File(newName);
        // 重命名
        return file.renameTo(fileNew);
    }

    public static void main(String[] args) {
        System.out.println("Rename File:" +
                rename("Peach.txt"));
    }
}
