/**
 * FileName: ShareDateUnSafeAttThread
 * Author:   99552
 * Date:     2018/5/11 14:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test;

public class ShareDateUnSafeAttThread extends Thread{
    private int i = 5;
    @Override
    public void run() {
        super.run();
        while (i>0){
            System.out.println("线程"+Thread.currentThread().getName()+",  "+(i--));
        }


    }

    public static void main(String[] args) {
        ShareDateUnSafeAttThread thread = new ShareDateUnSafeAttThread();
        Thread a = new Thread(thread, "A");
        Thread b = new Thread(thread, "B");
        Thread c = new Thread(thread, "C");
        Thread d = new Thread(thread, "D");
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
