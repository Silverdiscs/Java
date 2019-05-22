import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * @Author: CX
 * @Date: 2019/4/9 16:56
 * @Version 1.0
 */
//public class TestIO {
//    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入年龄：");
//        if (scanner.hasNextInt()) {
//            int age = scanner.nextInt();
//            System.out.println("老屁年龄为：" + age + "岁");
//        }else {
//            System.out.println("输入的内容不是数字！");
//        }
//        scanner.close();
//    }
//}



////打印流
//class PrintUtil {
//    private OutputStream out;
//
//    public PrintUtil(OutputStream out) {
//        this.out = out;
//    }
//    public void print(String str) {
//        try {
//            //实际上调用输出流的 write方法
//            this.out.write(str.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public void println(String str) {
//        this.print(str + "\r\n");
//    }
//    public void print(int data) {
//        this.print(String.valueOf(data));
//    }
//    public void println(int data) {
//        this.print(data + "\r\n");
//    }
//    public void print(double data) {
//        this.print(String.valueOf(data));
//    }
//    public void println(double data) {
//        this.print(data + "\r\n");
//    }
//    public void close() {
//        try {
//            this.out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//public class TestIO {
//    public static void main(String[] args) throws Exception{
//        //1.取得File对象
//        File file = new File("D:\\JAVA\\Others\\Hill.txt");
//        //2.取得输出流
//        PrintUtil print = new PrintUtil(new FileOutputStream(file));
//        //3.数据输出
//        print.print(10);
//        print.println("Pi");
//        print.print(13.14);
//        //4.关闭流
//        print.close();
//    }
//}

































