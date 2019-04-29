package com.thread.test.singlepattern.hungrymodel;
/**

* @Description:    单例模式（饿汉模式）立即加载
* @Author:         JackQiang
* @CreateDate:     2019/4/26 9:21
* @UpdateRemark:
*/
public class MyObject {

    /**
     *优点：写法简单，在类装载的时候完成实例化，避免了同步线程的问题
     *缺点：因为在类装在的时候就完成了实例化，如果在后续没有用到的化，那么会造成内存浪费
     * */
    private static MyObject myObject = new MyObject();

    private MyObject(){}

    public static MyObject getInstance(){
        return myObject;
    }
}