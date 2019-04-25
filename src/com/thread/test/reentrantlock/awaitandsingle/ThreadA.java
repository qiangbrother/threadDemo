package com.thread.test.reentrantlock.awaitandsingle;


/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 15:56
* @UpdateRemark:
*/
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}