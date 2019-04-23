/**
 * FileName: testMain
 * Author:   99552
 * Date:     2019/4/19 14:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/19 14:47          版本号   描述
 */
package com.thread.test.exceptionSynchronizeRelease;
/**

* @Description:    发生异常时，锁立即释放
* @Author:         JackQiang
* @CreateDate:     2019/4/19 14:59
* @UpdateRemark:
*/
public class testMain {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("b");
        threadA.start();
        Thread.sleep(500);
        ThreadB threadB= new ThreadB(service);
        threadB.setName("b");
        threadB.start();

        ThreadC threadC = new ThreadC(service);
        threadC.setName("c");
        threadC.start();
    }
}
