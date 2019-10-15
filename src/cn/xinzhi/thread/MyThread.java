package cn.xinzhi.thread;

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "这是个线程");
    }
}
