package com.thread.test.singlepattern.synchroizedinmethod;
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
     * 分析：因为懒汉模式在多线程的情况下，调用获取实例方法的时候，因为不是同步，造成不是单例，通过在
     *       获取实例的方法上面进行加锁，来保证在多线程的情况下同一个实例
     *
     * 问题：如果在方法体上面加锁，那么每次进行调用的时候都是同步，效率太低了，
     *      实际过程中只是需要在第一次创建的时候保证是同步的就可以了。在方法体上面加锁效率太低，那么在执行的代码块进行加锁呢
     * */
    synchronized public static MyObject getInstance(){
        if(myObject==null){
            myObject = new MyObject();
        }
        return myObject;
    }
}