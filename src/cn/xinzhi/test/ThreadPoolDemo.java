package cn.xinzhi.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        MyCallable myCallable = new MyCallable();
        service.submit(myCallable);
        service.submit(myCallable);
        service.submit(myCallable);
        service.shutdown();
    }
}
