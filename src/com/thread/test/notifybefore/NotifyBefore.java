package com.thread.test.notifybefore;
/**

* @Description:    通知过早
* @Author:         JackQiang
* @CreateDate:     2019/4/23 15:13
* @UpdateRemark:
*/
public class NotifyBefore {

    private String lock = new String("");

    private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("wait --- begin");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait --- end");
            }
        }
    };

    private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("notify --- begin");
                lock.notify();
                System.out.println("notify --- end");
            }
        }
    };

    public static void main(String[] args) {
        NotifyBefore before = new NotifyBefore();
        Thread thread1 = new Thread(before.runnable2);
        thread1.start();
        Thread thread2 = new Thread(before.runnable1);
        thread2.start();
    }
}