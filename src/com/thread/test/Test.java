/**
 * FileName: Test
 * Author:   99552
 * Date:     2018/5/22 11:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {

                System.out.println("111111111");
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {

                System.out.println("2222222222");
            }
        };

        ThreadGroup group = new ThreadGroup("新的线程数组");
        Thread t11 = new Thread(group, t1, "t1");
        Thread t22 = new Thread(group, t1, "t2");
        System.out.println(t11.getName()+"  "+t22.getName());

        System.out.println();
    }
}
