package com.thread.test.reentrantreadwritelock.read;

import com.thread.test.reentrantreadwritelock.read.ReadRun;

/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/25 15:32
* @UpdateRemark:
*/
public class ThreadA extends Thread{

    private ReadRun readRun;

    public ThreadA(ReadRun readRun){
        this.readRun = readRun;
    }

    @Override
    public void run() {
        readRun.read();
    }
}