/**
 * FileName: MyThreadRun
 * Author:   99552
 * Date:     2018/5/14 16:06
 * Description: 执行类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.interrupt;

public class MyThreadRun {
    public static void main(String[] args) throws InterruptedException {
        MyThread  myThread = new MyThread();
        Thread thread = new Thread() {
            @Override
            public void run() {
                myThread.printStirng();
            }
        };
        thread.setName("a");
        thread.start();
        thread.sleep(1000);

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                thread.resume();
                System.out.println("thread1-----");
                myThread.printStirng();
            }
        };
        thread1.start();
    }
}
