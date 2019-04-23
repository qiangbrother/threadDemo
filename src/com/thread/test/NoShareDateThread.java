/**
 * FileName: NoShareDateThread
 * Author:   99552
 * Date:     2018/5/11 9:43
 * Description: 线程数据不共享同一个变量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test;


public class NoShareDateThread extends Thread{

    private  int i = 5;

    public NoShareDateThread(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();

        while (i>0){
            i--;
            System.out.println("线程"+Thread.currentThread().getName()+",  "+i);
        }
    }

    public static void main(String[] args) {

        NoShareDateThread a = new NoShareDateThread("A");
        NoShareDateThread b = new NoShareDateThread("B");
        NoShareDateThread c = new NoShareDateThread("C");
        a.start();
        b.start();
        c.start();
    }
}
