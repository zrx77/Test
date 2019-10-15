package cn.xinzhi.thread1;

public class TestThread extends Thread {
    public TestThread() {
    }

    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "这是一个线程");
    }
}
