/**
 * FileName: MyThread
 * Author:   99552
 * Date:     2018/5/14 16:02
 * Description: 测试suspend独占
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.interrupt;

public class MyThread {

    synchronized public void printStirng(){
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("线程终止了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
