package cn.xinzhi.thread1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        TestRunable testRunable = new TestRunable();
        Thread thread = new Thread(testRunable);
        thread.start();
        TestCallable testCallable = new TestCallable();
        FutureTask<String> futureTask = new FutureTask<String>(testCallable);
        Thread thread1 = new Thread();
        thread1.start();
        String s = futureTask.get();
        System.out.println(s);
    }
}
