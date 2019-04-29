package com.thread.test.reentrantreadwritelock.write;

/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/25 15:33
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) {

        WriteRun run = new WriteRun();
        ThreadA a = new ThreadA(run);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(run);
        b.setName("B");
        b.start();

    }
}