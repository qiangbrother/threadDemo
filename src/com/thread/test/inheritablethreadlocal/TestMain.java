package com.thread.test.inheritablethreadlocal;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 15:18
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) {

        Tools.extend.set("Main========");
        System.out.println("main++++ ===== "+Tools.extend.get());
        ThreadA a = new ThreadA();
        a.start();
    }
}