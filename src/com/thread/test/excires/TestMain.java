package com.thread.test.excires;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/23 16:33
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) {

        DBTools dbTools = new DBTools();

        ThreadB b = new ThreadB(dbTools);
        b.start();
        ThreadA a = new ThreadA(dbTools);
        a.start();


    }
}