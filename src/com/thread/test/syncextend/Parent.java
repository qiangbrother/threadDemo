/**
 * FileName: Parent
 * Author:   99552
 * Date:     2019/4/19 15:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/19 15:00          版本号   描述
 */
package com.thread.test.syncextend;

public class Parent {

    synchronized public void service(){
        try {
            System.out.println("parent === " + Thread.currentThread().getName()+" time = "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("parent === " + Thread.currentThread().getName()+" time = "+System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
