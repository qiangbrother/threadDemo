/**
 * FileName: MyObject
 * Author:   99552
 * Date:     2018/5/15 14:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.synchronizedThread;

public class MyObject {

    synchronized public void methodA() throws InterruptedException {
        System.out.println("begin methondA ThreadName"+Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println(System.currentTimeMillis());
    }

   synchronized public void methodB()throws InterruptedException{
        System.out.println("begin methonB ThreadName"+Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println(System.currentTimeMillis());
    }
}
