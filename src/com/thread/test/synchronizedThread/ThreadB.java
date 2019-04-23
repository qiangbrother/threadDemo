/**
 * FileName: ThreadB
 * Author:   99552
 * Date:     2018/5/15 14:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.synchronizedThread;

public class ThreadB extends Thread{

    private MyObject myObject;
    @Override
    public void run() {
        try {
            myObject.methodB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }
}
