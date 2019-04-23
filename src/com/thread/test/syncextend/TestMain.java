/**
 * FileName: TestMain
 * Author:   99552
 * Date:     2019/4/19 15:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/19 15:07          版本号   描述
 */
package com.thread.test.syncextend;


public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Son son = new Son();
        ThreadA threadA = new ThreadA(son);
        threadA.setName("a");
        threadA.start();
        Thread.sleep(500);
        ThreadB threadB= new ThreadB(son);
        threadB.setName("b");
        threadB.start();
    }

}
