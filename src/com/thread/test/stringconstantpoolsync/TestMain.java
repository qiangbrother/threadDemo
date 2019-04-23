
package com.thread.test.stringconstantpoolsync;
/**

* @Description:    测试静态常量池缓存问题
* @Author:         JackQiang
* @CreateDate:     2019/4/22 14:16
* @UpdateRemark:
*/
public class TestMain {


    public static void main(String[] args) {
        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }

}
