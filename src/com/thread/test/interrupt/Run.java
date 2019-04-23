/**
 * FileName: Run
 * Author:   99552
 * Date:     2018/5/14 14:31
 * Description: 执行类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.interrupt;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyObject myObject = new MyObject();
        Thread thread = new Thread(){
            @Override
            public void run() {
                myObject.setValue("a","aaa");
            }
        };

        thread.setName("a");
        thread.start();
        thread.sleep(200);

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                myObject.printUsernameAndPassword();
            }
        };
        thread1.start();
    }
}
