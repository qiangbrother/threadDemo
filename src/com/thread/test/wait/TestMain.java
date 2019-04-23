package com.thread.test.wait;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/23 14:46
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(lock);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(lock);
        c.start();
    }
}