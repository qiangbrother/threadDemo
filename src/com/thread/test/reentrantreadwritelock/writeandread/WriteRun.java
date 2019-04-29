package com.thread.test.reentrantreadwritelock.writeandread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**

* @Description:    测试写写互斥
* @Author:         JackQiang
* @CreateDate:     2019/4/25 15:28
* @UpdateRemark:
*/
public class WriteRun {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write(){

        try {
            lock.writeLock().lock();
            System.out.println("线程"+Thread.currentThread().getName()+":"+System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }


}