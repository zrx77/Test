package cn.xinzhi.thread1;

import java.util.concurrent.Callable;

public class TestCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("这是第三种方式");
        return Thread.currentThread().getName()+"这是第三种方式";
    }
}
