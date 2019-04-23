
package com.thread.test.asynproblemreslove;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/22 15:38
* @UpdateRemark:
*/
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        RunThread thread = new RunThread();
        thread.start();
        Thread.sleep(1000);
        thread.isFlag(false);
        System.out.println("赋值为false");
    }
}
