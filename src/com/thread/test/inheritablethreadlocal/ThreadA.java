package com.thread.test.inheritablethreadlocal;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 15:15
* @UpdateRemark:
*/
public class ThreadA extends Thread {

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Thread A 取到的值 = "+Tools.extend.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}