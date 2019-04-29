package com.thread.test.reentrantreadwritelock.writeandread;

/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/25 15:32
* @UpdateRemark:
*/
public class ThreadB extends Thread{

    private WriteRun writeRun;

    public ThreadB(WriteRun writeRun){
        this.writeRun = writeRun;
    }

    @Override
    public void run() {
        writeRun.write();
    }
}