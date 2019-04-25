package com.thread.test.wait;
/**

* @Description:    线程A
* @Author:         JackQiang
* @CreateDate:     2019/4/23 14:39
* @UpdateRemark:
*/
public class ThreadC extends Thread{

    private Object lock;

    public ThreadC(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            //notifyAll()通知所有该共享资源的线程
            //lock.notifyAll();
            //notify(),随机通知该共享资源队列线程中的一个线程
            lock.notify();
            System.out.println("notify====");
        }

    }
}