package com.thread.test.joinandsleep;
/**

* @Description:    线程A在sleep状态下，不会释放线程B的锁
* @Author:         JackQiang
* @CreateDate:     2019/4/24 11:11
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        Thread.sleep(1000);
        ThreadC c = new ThreadC(b);
        c.start();
    }
}