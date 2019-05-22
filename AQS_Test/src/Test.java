import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Author: CX
 * @Date: 2019/4/26 上午 10:44
 * @Version 1.0
 */
//自定义了“锁”
//class NewBeeLock implements Lock {
//    private Sync sync = new Sync();
//
//    static class Sync extends AbstractQueuedSynchronizer {
//        @Override
//        //规定同步状态为 1
//        protected boolean tryAcquire(int arg) {
//            if (arg != 1) {
//                throw new RuntimeException("arg 不为1");
//            }
//            if (compareAndSetState(0,1)) {//获取锁
//                //当前线程成功获取到锁
//                setExclusiveOwnerThread(Thread.currentThread());
//                return true;
//            }
//            return false;
//        }
//
//        @Override
//        protected boolean tryRelease(int arg) {
//            if (getState() == 0) {
//                throw new IllegalMonitorStateException();//线程状态异常
//            }
//            setExclusiveOwnerThread(null);//获取锁线程，释放锁，置空
//            setState(0);
//            return true;
//        }
//
//        @Override
//        protected boolean isHeldExclusively() {//表示当前有没有拿到锁
//            return getState() == 1;//等于 1 表示拿到锁
//        }
//    }
//
//    //------------Lock接口方法----------------------------------------------------
//    @Override
//    public void lock() {
//        sync.acquire(1);
//    }
//
//    @Override
//    public void lockInterruptibly() throws InterruptedException {
//        sync.acquireInterruptibly(1);
//    }
//
//    @Override
//    public boolean tryLock() {
//        return sync.tryAcquire(1);
//    }
//
//    @Override
//    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
//        return sync.tryAcquireNanos(1,time);
//    }
//
//    @Override
//    public void unlock() {
//        sync.release(1);
//    }
//
//    @Override
//    public Condition newCondition() {
//        return null;
//    }
//    //------------Lock接口方法----------------------------------------------------
//}
//
//class MyThread implements Runnable {
//    Lock lock = new NewBeeLock();
//    @Override
//    public void run() {
//            try {
//                lock.lock();
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//            lock.unlock();
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread();
//            thread.start();
//        }
//    }
//}



public class Test {
    public static void main(String[] args) {

    }
}











































