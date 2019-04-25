package com.thread.test.reentrantlock.awaitandsingle;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 16:04
* @UpdateRemark:
*/
public class MyService {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void await(){
        lock.lock();
        try {
            System.out.println("await 时间 = "+System.currentTimeMillis());
            condition.await();
            System.out.println("await end time = "+Thread.currentThread().getName());
        }catch (Exception e){
           e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void single(){
        lock.lock();
        condition.signal();
        System.out.println("single 时间 = "+System.currentTimeMillis());

        lock.unlock();
    }

}