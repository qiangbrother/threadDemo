package com.thread.test.threadlocal;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 14:28
* @UpdateRemark:
*/
public class ThreadA extends Thread{

    @Override
    public void run() {
        for (int i=0;i<=20;i++){
            Tools.threadLocal.set("Thread A= "+i);
            System.out.println("Thread A = "+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}