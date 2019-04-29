package com.thread.test.reentrantreadwritelock.read;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/25 15:33
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) {

        ReadRun run = new ReadRun();
        ThreadA a = new ThreadA(run);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(run);
        b.setName("B");
        b.start();

    }
}