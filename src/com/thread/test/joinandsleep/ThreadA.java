package com.thread.test.joinandsleep;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 10:59
* @UpdateRemark:
*/
public class ThreadA extends Thread{

    private ThreadB threadB;

    public ThreadA(ThreadB threadB){
        this.threadB = threadB;
    }

    @Override
    public void run() {
        try {
            synchronized (threadB) {
                threadB.start();
                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}