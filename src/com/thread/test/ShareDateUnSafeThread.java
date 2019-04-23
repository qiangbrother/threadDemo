/**
 * FileName: ShareDateUnSafeThread
 * Author:   99552
 * Date:     2018/5/11 10:36
 * Description: 非线程安全数据共享
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test;

public class ShareDateUnSafeThread extends Thread{
    private int i = 5;
    @Override
    public void run() {
        super.run();
        //在使用while或者forxuanhu
        while (i>0){
            i--;
            System.out.println("线程"+Thread.currentThread().getName()+",  "+i);
        }


    }

    public static void main(String[] args) {
        ShareDateUnSafeThread thread = new ShareDateUnSafeThread();
        Thread a = new Thread(thread, "A");
        Thread b = new Thread(thread, "B");
        Thread c = new Thread(thread, "C");
        Thread d = new Thread(thread, "D");
        a.start();
        b.start();
        c.start();
        d.start();
        System.out.println("线程"+Thread.currentThread().getName());

    }
}
