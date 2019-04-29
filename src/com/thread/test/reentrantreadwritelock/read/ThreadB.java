package com.thread.test.reentrantreadwritelock.read;

/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/25 15:32
* @UpdateRemark:
*/
public class ThreadB extends Thread{

    private ReadRun readRun;

    public ThreadB(ReadRun readRun){
        this.readRun = readRun;
    }

    @Override
    public void run() {
        readRun.read();
    }
}