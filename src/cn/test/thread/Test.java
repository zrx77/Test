package cn.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        MyCallable myCallable = new MyCallable();
        service.submit(myCallable);
        service.submit(myCallable);
        service.shutdown();
    }
}
