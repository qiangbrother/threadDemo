package com.thread.test.singlepattern.dclmodel;
/**

* @Description:    在获取实例方法上加锁
* @Author:         JackQiang
* @CreateDate:     2019/4/26 9:50
* @UpdateRemark:
*/
public class MyObject {

    volatile private static MyObject myObject;

    private MyObject(){}
    /**
     * 分析：使用dcl检查机制，双重检查机制，保证了线程之间的可见性，同时也提高了效率，推荐使用

     * */
     public static MyObject getInstance(){
             if(myObject==null){
                 synchronized (MyObject.class){
                     myObject = new MyObject();
                 }
         }
        return myObject;
    }
}