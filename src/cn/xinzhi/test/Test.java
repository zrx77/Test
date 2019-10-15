package cn.xinzhi.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        TestCallable testCallable = new TestCallable();
        service.submit(testCallable);
        service.submit(testCallable);
        service.submit(testCallable);
        service.shutdown();
    }
}
