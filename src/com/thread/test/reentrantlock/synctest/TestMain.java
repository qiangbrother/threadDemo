package com.thread.test.reentrantlock.synctest;
/**

* @Description:    
* @Author:         JackQiang
* @CreateDate:     2019/4/24 16:00
* @UpdateRemark:   
*/
public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.start();
    }
}