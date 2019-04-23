package com.thread.test.wait;
/**

* @Description:    线程A
* @Author:         JackQiang
* @CreateDate:     2019/4/23 14:39
* @UpdateRemark:
*/
public class ThreadB extends Thread{

    private Object lock;

    public ThreadB(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        WaitService service = new WaitService();
        service.testMethod(lock);
    }
}