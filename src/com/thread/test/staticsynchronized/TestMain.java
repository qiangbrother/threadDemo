
package com.thread.test.staticsynchronized;
/**

* @Description:    静态方法加锁，加的是class锁
* @Author:         JackQiang
* @CreateDate:     2019/4/22 13:44
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) {

        ThreadA threadA = new ThreadA();
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.setName("B");
        threadB.start();
    }
}
