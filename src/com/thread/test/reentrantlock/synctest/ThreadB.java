package com.thread.test.reentrantlock.synctest;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 15:56
* @UpdateRemark:
*/
public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodB();
    }
}