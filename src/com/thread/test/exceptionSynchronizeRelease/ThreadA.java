/**
 * FileName: ThreadA
 * Author:   99552
 * Date:     2019/4/19 14:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/19 14:45          版本号   描述
 */
package com.thread.test.exceptionSynchronizeRelease;

public class ThreadA extends Thread{

    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.testMetod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
