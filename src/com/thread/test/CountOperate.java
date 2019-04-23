/**
 * FileName: CountOperate
 * Author:   99552
 * Date:     2018/5/11 15:26
 * Description: currentThread
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test;

public class CountOperate extends Thread{


    public CountOperate() {
        System.out.println("countOperate--------begin");
        System.out.println("Thread.currentThread().getName()"+Thread.currentThread().getName());
        System.out.println("this.getName()"+this.getName());
        System.out.println("countOperate--------end");
    }

    @Override
    public void run() {
        System.out.println("countOperate--------begin");
        System.out.println("Thread.currentThread().getName()"+Thread.currentThread().getName());
        System.out.println("this.getName()"+this.getName());
        System.out.println("countOperate--------end");
    }


}
