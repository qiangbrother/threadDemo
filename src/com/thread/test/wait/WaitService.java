package com.thread.test.wait;

public class WaitService {

    public void testMethod(Object lock){

        synchronized (lock){
            try {
                System.out.println("begin -------- "+Thread.currentThread().getName());
                lock.wait();
                System.out.println("end ----------"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}