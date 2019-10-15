package cn.test.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println(1+Thread.currentThread().getName());
        Thread.sleep(2000);
        System.out.println(2);
        System.out.println(3);
        return null;
    }
}
