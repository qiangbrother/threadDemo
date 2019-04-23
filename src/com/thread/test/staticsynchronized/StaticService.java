/**
 * FileName: StaticService
 * Author:   99552
 * Date:     2019/4/22 11:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/22 11:22          版本号   描述
 */
package com.thread.test.staticsynchronized;

public class StaticService {

    public synchronized static void methodA(){
        try {
            System.out.println("线程名称为："+Thread.currentThread().getName()+"进入");
            Thread.sleep(3000);
            System.out.println("线程名称为："+Thread.currentThread().getName()+"离开");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void testMethod(){

            System.out.println("线程名称为："+Thread.currentThread().getName()+"进入");
            System.out.println("线程名称为："+Thread.currentThread().getName()+"离开");

    }
}
