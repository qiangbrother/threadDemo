/**
 * FileName: testMain
 * Author:   99552
 * Date:     2019/4/19 14:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/19 14:47          版本号   描述
 */
package com.thread.test.objectlistener;

import com.thread.test.exceptionSynchronizeRelease.ThreadC;

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
        threadA.setName("a");
        threadA.start();
        Thread.sleep(500);
        ThreadB threadB= new ThreadB(service);
        threadB.setName("b");
        threadB.start();


    }
}
