package com.thread.test.joinandsleep;
/**

* @Description:    
* @Author:         JackQiang
* @CreateDate:     2019/4/24 11:00
* @UpdateRemark:   
*/
public class ThreadB extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("ThreadB begin ------- " +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("ThreadB end ------- " +System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public void testB(){
        System.out.println("testB ----- "+System.currentTimeMillis());
    }
}