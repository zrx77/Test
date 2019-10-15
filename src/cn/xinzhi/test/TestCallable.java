package cn.xinzhi.test;

import java.util.concurrent.Callable;

public class TestCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("这是第一次");
        Thread.sleep(2000);
        System.out.println("又一次"+Thread.currentThread().getName());
        System.out.println("再一次");
        return null;
    }
}
