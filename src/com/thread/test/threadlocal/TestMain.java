package com.thread.test.threadlocal;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 14:30
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.start();
        Threadb threadb = new Threadb();
        threadb.start();

        Tools.threadLocal.set("main");

        System.out.println(Tools.threadLocal.get());

    }
}