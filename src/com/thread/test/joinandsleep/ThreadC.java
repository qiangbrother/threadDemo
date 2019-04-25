package com.thread.test.joinandsleep;
/**

* @Description:    
* @Author:         JackQiang
* @CreateDate:     2019/4/24 11:00
* @UpdateRemark:   
*/
public class ThreadC extends Thread{

    private ThreadB b;

    public ThreadC(ThreadB b){
        this.b = b;
    }

    @Override
    public void run() {
        b.testB();
    }
}