package com.thread.test.reentrantreadwritelock.write;

/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/25 15:32
* @UpdateRemark:
*/
public class ThreadA extends Thread{

    private WriteRun writeRun;

    public ThreadA(WriteRun writeRun){
        this.writeRun = writeRun;
    }

    @Override
    public void run() {
        writeRun.write();
    }
}