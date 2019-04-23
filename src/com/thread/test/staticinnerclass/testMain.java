/**
 * FileName: testMain
 * Author:   99552
 * Date:     2019/4/22 14:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/22 14:55          版本号   描述
 */
package com.thread.test.staticinnerclass;

public class testMain {

    public static void main(String[] args) {
        OutClass.Inner inner = new OutClass.Inner();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        });

        thread.setName("A");

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        });

        b.setName("B");
        thread.start();

        b.start();
    }
}
