/**
 * FileName: ThreadA
 * Author:   99552
 * Date:     2019/4/19 14:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/19 14:45          版本号   描述
 */
package com.thread.test.syncextend;

import com.thread.test.exceptionSynchronizeRelease.Service;

public class ThreadA extends Thread{

    private Son son;

    public ThreadA(Son son){
        this.son = son;
    }

    @Override
    public void run() {
        son.service();
    }
}
