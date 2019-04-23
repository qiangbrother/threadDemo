/**
 * FileName: MyRunnable
 * Author:   99552
 * Date:     2018/5/11 9:32
 * Description: 实现Runnable接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
      /*  Thread thread = new Thread(new MyRunnable(),"runnables");
        thread.start();*/
        CountOperate operate = new CountOperate();
        operate.setName("test");
        Thread thread = new Thread(operate);
        thread.start();


    }
}
