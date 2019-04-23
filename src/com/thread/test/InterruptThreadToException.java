/**
 * FileName: InterruptThreadToException
 * Author:   99552
 * Date:     2018/5/14 11:02
 * Description: 通过异常来让线程停止
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test;

public class InterruptThreadToException extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0;i<50000;i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("Thread begin");
            Thread.sleep(200000);
            System.out.println("Thread end");
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }


    public static void main(String[] args) {
        InterruptThreadToException thread = new InterruptThreadToException();
        thread.start();
        thread.interrupt();
        System.out.println("end");
    }

}

