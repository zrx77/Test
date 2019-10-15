package cn.xinzhi.thread1;

public class TestRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"这是第二个线程的方式");
    }
}
