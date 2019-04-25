package com.thread.test.reentrantlock.awaitandsingle;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 16:11
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("A");
        a.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myService.single();
    }
}