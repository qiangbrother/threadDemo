/**
 * FileName: Son
 * Author:   99552
 * Date:     2019/4/19 15:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/19 15:03          版本号   描述
 */
package com.thread.test.syncextend;

public class Son extends Parent{

    @Override
    public synchronized void service() {
        try {
            System.out.println("Son === " + Thread.currentThread().getName()+" time = "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("Son === " + Thread.currentThread().getName()+" time = "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
