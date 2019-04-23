/**
 * FileName: Service
 * Author:   99552
 * Date:     2019/4/19 14:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/19 14:41          版本号   描述
 */
package com.thread.test.exceptionSynchronizeRelease;

public class Service {

    synchronized public void testMetod() throws InterruptedException {
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("threadName = "+Thread.currentThread().getName()+"  "+System.currentTimeMillis());
            Integer.parseInt("a");
        }else{
            System.out.println("=================bbbbbbbbbbbbbb=============");
            System.out.println("threadName = "+Thread.currentThread().getName()+"  "+System.currentTimeMillis());
            Thread.sleep(5000);
        }
    }

    synchronized public void method(){
        System.out.println("****************mmmmmmmmmmmmmmmmm*******************");
    }
}
