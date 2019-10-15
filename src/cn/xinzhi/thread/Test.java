package cn.xinzhi.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable,"线程");
        thread.start();
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<String>(myCallable);
        Thread thread1 = new Thread();
        thread1.start();
        String s = futureTask.get();
        System.out.println(s);
    }
}
