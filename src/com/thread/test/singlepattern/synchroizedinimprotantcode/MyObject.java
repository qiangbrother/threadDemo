package com.thread.test.singlepattern.synchroizedinimprotantcode;
/**

* @Description:    在获取实例方法上加锁
* @Author:         JackQiang
* @CreateDate:     2019/4/26 9:50
* @UpdateRemark:
*/
public class MyObject {

    private static MyObject myObject;

    private MyObject(){}
    /**
     * 分析：在重要的代码块上面进行加锁，这个方式也会造成多个实例。private static MyObject myObject 存在于共享堆栈和私有堆栈中
     *      线程首先会在私有堆栈中对值进行修改，那么如果线程A进行了实例，实例化的是私有堆栈的，线程B获取到共享堆栈中的没有实例化
     *      所以，在进行实例化，导致多次实例化
     *
     * 解决：使用volatile，来保证线程之间的可见性
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