package com.thread.test.reentrantlock.synctest;

import java.util.concurrent.locks.ReentrantLock;

/**

* @Description:    ReentrantLock 中的lock跟synchroized 都是获取 "对象监听器" 同步进行
* @Author:         JackQiang
* @CreateDate:     2019/4/24 15:53
* @UpdateRemark:
*/
public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    public void methodA(){
        lock.lock();
        System.out.println("methodA ==" +System.currentTimeMillis());
        lock.unlock();
    }

    public void methodB(){
        lock.lock();
        System.out.println("methodB ==" +System.currentTimeMillis());
        lock.unlock();
    }
}