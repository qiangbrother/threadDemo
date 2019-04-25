package com.thread.test.threadlocal;
/**

* @Description:    ThreadLocal的使用
* @Author:         JackQiang
* @CreateDate:     2019/4/24 14:15
* @UpdateRemark:
*/
public class ThreadLocalTest {

    public static ThreadLocal t =  new ThreadLocal();

    public static void main(String[] args) {

        if (t.get()==null){
            System.out.println("ThreadLocal 为空");
            t.set("1111");
            t.set("2222");
        }

        System.out.println(t.get());
        System.out.println(t.get());

        t.remove();

    }
}