package cn.xinzhi.thread;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"这是第二种方式");
    }
}
