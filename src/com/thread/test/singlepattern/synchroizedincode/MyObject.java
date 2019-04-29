package com.thread.test.singlepattern.synchroizedincode;
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
     * 分析：将方法上加锁换到对代码块进行加锁，将方法中的代码全部进行了加锁，虽然在调用方法是异步的，但是在实际
     *      执行的过程中，方法的全部代码都是持有锁的，性能方面也是很差，有点类似于在方法上面加锁
     *
     * 解决：那么如果在重要的代码块上加锁呢
     * */
     public static MyObject getInstance(){
         synchronized (MyObject.class){
             if(myObject==null){
                 myObject = new MyObject();
             }
         }
        return myObject;
    }
}