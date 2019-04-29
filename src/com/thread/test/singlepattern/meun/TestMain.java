package com.thread.test.singlepattern.meun;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestMain {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();

        LinkedBlockingQueue<Runnable> queue =
                           new LinkedBlockingQueue<Runnable>(3);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 6,
                10000, TimeUnit.SECONDS, queue);

        for (int i=0;i<=10;i++){
            System.out.println(poolExecutor.getActiveCount());

            poolExecutor.execute(
                    new Thread(() -> {
                        System.out.println(myObject.getName().hashCode());
                    })
            );
        }

    }
}