import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

/**
 * @Author: CX
 * @Date: 2019/4/14 下午 4:54
 * @Version 1.0
 * 多线程 01 继承Thread类实现多线程
 */

class MyThread extends Thread {
    private String title;

    public MyThread(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.title + "、" + i);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("A");
        Thread thread2 = new MyThread("B");
        Thread thread3 = new MyThread("C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}



//class MyThread implements Runnable {
//    private int ticket = 10;
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("还剩下" + ticket-- + "票");
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt);
//        Thread thread2 = new Thread(mt);
//        Thread thread3 = new Thread(mt);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}



//class MyThread implements Callable<String> {
//    private int ticket = 10;
//
//    @Override
//    public String call() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("还剩下" + ticket-- + "票");
//        }
//        return "票已售罄";
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Callable<String> callable = new MyThread();
//        FutureTask<String> futureTask = new FutureTask<>(callable);
//        Thread thread = new Thread(futureTask);
//        thread.start();
//        System.out.println(futureTask.get());
//    }
//}



//class MyThread implements Runnable {
//    private int ticket = 10;
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + "还剩下" + this.ticket-- + "票");
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"黄牛A");
//        Thread thread2 = new Thread(mt,"黄牛B");
//        Thread thread3 = new Thread(mt,"黄牛C");
//        thread1.setName("蠢人");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}


//class MyThread extends Thread {
//    private int ticket = 10;
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + "还剩下" + this.ticket-- + "票");
//        }
//    }
//}
//
//public class Test {
//    //主线程
//    public static void main(String[] args) {
//        Thread thread1 = new MyThread();
//        thread1.run();
//    }
//}



//class MyThread implements Callable<String> {
//    private int ticket = 10;
//    public String call() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("还剩下" +
//                    ticket-- + "票");
//        }
//        return "票已售罄";
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Callable<String> callable = new MyThread();
//        FutureTask<String> futureTask = new FutureTask<>(callable);
//        Thread thread = new Thread(futureTask);
//        thread.start();
//        System.out.println(futureTask.get());
//    }
//}



//线程休眠 sleep
//class MyThread extends Thread {
//    private int ticket = 10;
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() +
//                    "还剩下" + this.ticket-- + "票");
//        }
//    }
//}
//
//public class Test {
//    //主线程
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("main方法开始...");
//        MyThread myThread = new MyThread();
//        System.out.println("11111");
//        myThread.start();
//        Thread.sleep(2000);
//        System.out.println("22222");
//        System.out.println("main方法结束...");
//    }
//}





//class MyThread extends Thread {
//    private int ticket = 10;
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() +
//                    "还剩下" + i);
//        }
//    }
//}
//
//public class Test {
//    //主线程
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"A线程");
//        Thread thread2 = new Thread(mt,"B线程");
//        Thread thread3 = new Thread(mt,"C线程");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}



//class MyThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            Thread.yield();
//            System.out.println(Thread.currentThread().getName() +
//                    "还剩下" + i);
//        }
//    }
//}
//
//public class Test {
//    //主线程
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"A线程");
//        Thread thread2 = new Thread(mt,"B线程");
//        Thread thread3 = new Thread(mt,"C线程");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}


//class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println("子线程开始执行...");
//        Test.printTime();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Test.printTime();
//        System.out.println("子线程run方法结束...");
//    }
//}
//
//public class Test {
//    //主线程
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("主方法开始...");
//        MyThread mt = new MyThread();
//        Thread thread = new Thread(mt);
//        thread.start();
//        thread.join();
//        System.out.println("主方法结束...");
//    }
//    public static void printTime() {
//        Date date = new Date();
//        DateFormat dateFormat =
//                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String str = dateFormat.format(date);
//        System.out.println(str);
//    }
//}



//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + "、" + i);
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"线程A");
//        Thread thread2 = new Thread(mt,"线程B");
//        Thread thread3 = new Thread(mt,"线程C");
//        thread1.setPriority(Thread.MIN_PRIORITY);
//        thread2.setPriority(Thread.NORM_PRIORITY);
//        thread3.setPriority(Thread.MAX_PRIORITY);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName()
//        + "是否为守护线程" + Thread.currentThread().isDaemon());
//    }
//}


//
//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        int i = 1;
//        while (true) {
//            try {
//                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName()
//                + "是否为守护线程" + Thread.currentThread().isDaemon());
//            } catch (InterruptedException e) {
//                System.out.println(Thread.currentThread().getName()
//                        + "退出...");
//                return;
//            }
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"子线程A");
//        Thread thread2 = new Thread(mt,"子线程B");
//        //必须在线程启动之前设置
//        thread1.setDaemon(true);
//
//        thread1.start();
//        thread2.start();
//        Thread.sleep(3000);
//        thread2.interrupt();
//    }
//}




//线程同步
//class MyThread implements Runnable {
//    private int ticket = 10;
//    @Override
//    public void run() {
//        while (this.ticket > 0) {
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()
//            + "还剩下" + this.ticket-- + "票");
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"黄牛A");
//        Thread thread2 = new Thread(mt,"黄牛B");
//        Thread thread3 = new Thread(mt,"黄牛C");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}



//
//class MyThread implements Runnable {
//    private int ticket = 1000;
//    @Override
//    public void run() {
//        for (int i = 0;i < 1000;i++) {
//            //为程序上锁
//            synchronized (this) {
//                if(this.ticket > 0) {
//                    try {
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()
//                            + "还剩下" + this.ticket-- + "票");
//                }
//            }
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"黄牛A");
//        Thread thread2 = new Thread(mt,"黄牛B");
//        Thread thread3 = new Thread(mt,"黄牛C");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}




//
//class MyThread implements Runnable {
//    private int ticket = 1000;
//    @Override
//    public void run() {
//        for (int i = 0;i < 1000;i++) {
//            sale();
//        }
//    }
//    //表实此时只有一个线程能进入此方法
//    //隐式锁对象 this
//    public synchronized void sale() {
//        if (ticket > 0) {
//            System.out.println(Thread.currentThread().getName()
//                    + "还剩下" + this.ticket-- + "票");
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"黄牛A");
//        Thread thread2 = new Thread(mt,"黄牛B");
//        Thread thread3 = new Thread(mt,"黄牛C");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}


//class Sync {
//    //任意时刻只有一个线程（同一个对象）能进入此方法
//    //锁Sync.class
//    public synchronized void fun() {
//        System.out.println(Thread.currentThread().getName()
//        + "fun方法开始");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(Thread.currentThread().getName()
//                + "fun方法结束");
//    }
//}
//
//class MyThread implements Runnable {
//    private Sync sync;
//    public MyThread(Sync sync) {
//        this.sync = sync;
//    }
//    public void run() {
//        this.sync.fun();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        Sync sync = new Sync();
//        MyThread mt = new MyThread(sync);
//        Thread thread1 = new Thread(mt,"线程A");
//        Thread thread2 = new Thread(mt,"线程B");
//        Thread thread3 = new Thread(mt,"线程C");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}



//
//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        test1();
//        test2();
//    }
//
//    public synchronized void  test1() {
//        if (Thread.currentThread().getName().equals("A")) {
//            while (true) {
//            }
//        }
//    }
//    public synchronized void test2() {
//        if (Thread.currentThread().getName().equals("B")) {
//            System.out.println("B线程进入该同步方法test2");
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread mt = new MyThread();
//        Thread threadA = new Thread(mt,"A");
//        Thread threadB = new Thread(mt,"B");
//        threadA.start();
//        Thread.sleep(1000);
//        threadB.start();
//    }
//}




//
//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        test1();
////        test2();
//    }
//
//    public synchronized void  test1() {
//        if (Thread.currentThread().getName().equals("A")) {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("A线程进入test1方法");
//            test2();
//        }
//    }
//    public synchronized void test2() {
////        if (Thread.currentThread().getName().equals("B")) {
////            System.out.println("B线程进入该同步方法test2");
////        }else {
//            System.out.println(Thread.currentThread().getName() + "进入test2方法");
////        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread mt = new MyThread();
//        Thread threadA = new Thread(mt,"A");
//        Thread threadB = new Thread(mt,"B");
//        threadA.start();
//        Thread.sleep(1000);
//        threadB.start();
//    }
//}


//
//class MyThread implements Runnable {
//    private int ticket = 10;
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + "还剩下" + this.ticket-- + "票");
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"黄牛A");
//        Thread thread2 = new Thread(mt,"黄牛B");
//        Thread thread3 = new Thread(mt,"黄牛C");
//        thread1.setName("蠢人");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}



//
//class Sync {
//    public void test() {
//        synchronized (Sync.class) {
//            System.out.println("test方法开始，当前线程为 " +
//                    Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("test方法结束，当前线程为 " +
//                    Thread.currentThread().getName());
//        }
//    }
//}
//
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        Sync sync = new Sync();
//        sync.test();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            Thread thread = new MyThread();
//            thread.start();
//        }
//    }
//}


//生产消费模型
//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        synchronized (this) {
//            try {
//                System.out.println("wait begin...");
////                wait();
//                wait(1000);
//                System.out.println("wait end...");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        new Thread(new MyThread()).start();
//    }
//}


//
//class MyThread implements Runnable {
//    private boolean flag;
//    //锁对象
//    private Object object;
//
//    public MyThread(boolean flag, Object object) {
//        this.flag = flag;
//        this.object = object;
//    }
//
//    public void waitMethod() {
//        synchronized (object) {
//            System.out.println(Thread.currentThread().getName() + " " + "wait begin...");
//            try {
//                object.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + " " + "wait end...");
//        }
//    }
//
//    public void notifyMethod() {
//        synchronized (object) {
//            System.out.println(Thread.currentThread().getName() + "notify begin...");
//            object.notifyAll();
//            System.out.println(Thread.currentThread().getName() + "notify end...");
//        }
//    }
//    @Override
//    public void run() {
//        if (flag) {
//            waitMethod();
//        }else {
//            notifyMethod();
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        Object object = new Object();
//        MyThread mt1 = new MyThread(true,object);
//        MyThread mt2 = new MyThread(false,object);
//        for (int i = 0;i < 10;i++) {
//            Thread waitThread = new Thread(mt1,"waitThread" +" "+ i);
//            waitThread.start();
//        }
//        Thread notifyThread = new Thread(mt2,"notifyThread");
//        Thread.sleep(1000);
//        notifyThread.start();
//    }
//}





//生产与消费者模型 ———— 单线生产（单一商品），单线消费

//商品类
//class Goods {
//    private String goodsName;//商品名称
//    private int count;//商品数量
//
//    //生产商品方法（同步方法） ——— 凡是针对共享资源的数量以及内容的修改必须同步
//    public synchronized void setGoods(String goodsName) {
//        //当前还有商品，需要等待消费者消费
//        if (count > 0) {
//            try {
//                System.out.println("还有商品库存，休息一下");
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        this.goodsName = goodsName;
//        this.count++;
//        System.out.println("生产" + toString());
//        //生产完商品后，唤醒消费者
//        notify();
//    }
//
//    //消费商品方法
//    public synchronized void getGoods() {
//        //当前还没有商品，消费者需要等待
//        if (this.count == 0) {
//            try {
//                System.out.println("商品卖完了，客官请稍等");
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        this.count -- ;
//        System.out.println("消费" + toString());
//        //消费完商品后，告诉生产者继续生产
//        notify();
//    }
//
//    @Override
//    public String toString() {
//        return "Goods{" +
//                "goodsName='" + goodsName + '\'' +
//                ", count=" + count +
//                '}';
//    }
//}
//
////生产者
//class Producer implements Runnable {
//    private Goods goods;
//
//    public Producer(Goods goods) {
//        this.goods = goods;
//    }
//    @Override
//    public void run() {
//        this.goods.setGoods("生产iPhone");
//    }
//}
//
////消费者
//class Consumer implements Runnable {
//    private Goods goods;
//
//    public Consumer(Goods goods) {
//        this.goods = goods;
//    }
//
//    @Override
//    public void run() {
//        this.goods.getGoods();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Goods goods = new Goods();
//        Producer producer = new Producer(goods);
//        Consumer consumer = new Consumer(goods);
//        Thread thread = new Thread(producer,"生产者");
//        Thread thread1 = new Thread(consumer,"消费者");
//        thread1.start();
//        thread.start();
////        thread.start();
////        thread1.start();
//    }
//}



//生产与消费者模型 ———— 多线生产（单一商品），多线消费

//商品类
//class Goods {
//    private String goodsName;//商品名称
//    private int count;//商品数量
//    //生产商品方法（同步方法） ——— 凡是针对共享资源的数量以及内容的修改必须同步
//    public synchronized void setGoods(String goodsName) {
//        //当前还有商品，需要等待消费者消费
//        while (count > 0) {
//            try {
//                System.out.println("还有商品库存，休息一下");
//                //----------------------------------------
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        this.goodsName = goodsName;
//        this.count++;
//        System.out.println(Thread.currentThread().getName() +
//                "生产" + toString());
//        //生产完商品后，唤醒消费者
//        notifyAll();
//    }
//    //消费商品方法
//    public synchronized void getGoods() {
//        //当前还没有商品，消费者需要等待
//        while (this.count == 0) {
//            try {
//                System.out.println("商品卖完了，客官请稍等");
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        this.count -- ;
//        System.out.println(Thread.currentThread().getName() +
//                "消费" + toString());
//        //消费完商品后，告诉生产者继续生产
//        notifyAll();
//    }
//
//    @Override
//    public String toString() {
//        return "Goods{" +
//                "goodsName='" + goodsName + '\'' +
//                ", count=" + count +
//                '}';
//    }
//}
//
////生产者
//class Producer implements Runnable {
//    private Goods goods;
//
//    public Producer(Goods goods) {
//        this.goods = goods;
//    }
//    @Override
//    public void run() {
//        while (true) {
//            this.goods.setGoods("生产iPhone");
//        }
//    }
//}
//
////消费者
//class Consumer implements Runnable {
//    private Goods goods;
//
//    public Consumer(Goods goods) {
//        this.goods = goods;
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//            this.goods.getGoods();
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Goods goods = new Goods();
//        List<Thread> list = new ArrayList<>();
//        Producer producer = new Producer(goods);
//        Consumer consumer = new Consumer(goods);
//        //5个生产者
//        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(producer,"生产者" + i );
//            list.add(thread);
//        }
//        //10个消费者
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(consumer,"消费者" + i );
//            list.add(thread);
//        }
//        for (Thread thread : list) {
//            thread.start();
//        }
//    }
//}



/*
写两个线程，一个线程打印 1~52 ,另一个线程打印 A~Z
打印顺序是 12A34B...5152Z
*/

//class Print {
//    // 信号量
//    private boolean flag = true;
//    private int count = 1;
//    // 打印数字方法
//    public synchronized void printNum() {
//        if (flag == false) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(2*count - 1);
//        System.out.println(2*count);
//        //该打印字母线程执行
//        flag = false;
//        // 唤醒
//        notify();
//    }
//
//    // 打印字母方法
//    public synchronized void printChar() {
//        if (flag == true) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println((char)('A' + count - 1));
//        flag = true;
//        count++;
//        // 唤醒
//        notify();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Print print = new Print();
//        List<Thread> list = new ArrayList<>();
//        //打印数字线程
//        // 这里使用了一个Lambda表达式
//        new Thread(() ->{
//            for (int i = 0; i < 26; i++) {
//                print.printNum();
//            }
//        }).start();
//
//        //打印字母线程
//        // 这里使用了一个Lambda表达式
//        new Thread(() ->{
//            for (int i = 0; i < 26; i++) {
//                print.printChar();
//            }
//        }).start();
//    }
//}



/*
编写一个程序，启动三个线程，三个线程的名称分别是  A，B，C；
每个线程将自己的名称在屏幕上打印5遍，打印顺序是 ABCABC...
*/
/*
class Print {
    // 信号量
    private int flag = 1;
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void printA() {
        while (flag != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName());
        flag = 2;
        notifyAll();
        count++;
    }
    public synchronized void printB() {
        while (flag != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName());
        flag = 3;
        notifyAll();
        count++;
    }
    public synchronized void printC() {
        while (flag != 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName());
        flag = 1;
        notifyAll();
        count++;
    }
}

class MyThread implements Runnable {
    private Print print;

    public MyThread(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        while (print.getCount() < 13) {
            if (Thread.currentThread().getName().equals("A")) {
                print.printA();
            }else if (Thread.currentThread().getName().equals("B")) {
                print.printB();
            }else if (Thread.currentThread().getName().equals("C")) {
                print.printC();
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Print print = new Print();
        MyThread myThread = new MyThread(print);
        new Thread(myThread,"A").start();
        new Thread(myThread,"B").start();
        new Thread(myThread,"C").start();
    }
}

*/


























































