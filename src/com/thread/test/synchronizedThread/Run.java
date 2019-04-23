/**
 * FileName: Run
 * Author:   99552
 * Date:     2018/5/15 14:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.synchronizedThread;


import java.util.Calendar;

public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.start();
        ThreadB b = new ThreadB(object);
        b.start();
        Calendar instance = Calendar.getInstance();


    }
}
