/**
 * FileName: Service
 * Author:   99552
 * Date:     2019/4/19 14:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/19 14:41          版本号   描述
 */
package com.thread.test.objectlistener;

public class Service {

    private String string =  new String ();

    public void testMetod()  {

        synchronized (string){
            try {

                System.out.println(" a begin");
                Thread.sleep(3000);
                System.out.println("a end");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public void method(){
        System.out.println("b begin");
        System.out.println("b end");

    }
}
