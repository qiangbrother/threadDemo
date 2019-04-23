/**
 * FileName: ThreadA
 * Author:   99552
 * Date:     2018/5/15 14:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.synchronizedThread;

public class ThreadA extends Thread {

    private MyObject myObject;
    @Override
    public void run() {
        try {
            myObject.methodA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ThreadA(MyObject myObject) {
        this.myObject = myObject;
    }
}
