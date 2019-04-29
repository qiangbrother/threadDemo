package com.thread.test.singlepattern.serializable;

import java.io.Serializable;

/**

* @Description:    使用静态类来创建单利
* @Author:         JackQiang
* @CreateDate:     2019/4/26 9:50
* @UpdateRemark:
*/
public class MyObject implements Serializable{

    private static class MyObjectCreate{
        private static MyObject myObject = new MyObject();
    }

    private MyObject(){}
    /**
     * 问题：如果类进行了序列化了，那么也不能实现单例
     * */
     public static MyObject getInstance(){
        return MyObjectCreate.myObject;
    }

    protected Object readResovle(){
        System.out.println("序列化了");
        return MyObjectCreate.myObject;
    }
}