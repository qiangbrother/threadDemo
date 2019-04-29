package com.thread.test.singlepattern.layzemodel;
/**

* @Description:    延迟加载（懒汉模式）
* @Author:         JackQiang
* @CreateDate:     2019/4/26 9:50
* @UpdateRemark:
*/
public class MyObject {

    private static MyObject myObject;

    private MyObject(){}
    /**
     * 分析：懒汉模式相比较于饿汉模式，是在需要实例的时候创建，避免了饿汉模式内存浪费的问题
     *      但是，如果在多线程的情况下，在进行if判断的时候，还没有执行到下一步的时候，其他线程
     *      也通过判断语句进行创建实例，那么这时候就会出现多个实例了。
     * 初步解决方案：
     *      在获取实例的方法上面加锁，来保证在多线程的情况下保持同步
     * */
    public static MyObject getInstance(){
        if(myObject==null){
            myObject = new MyObject();
        }
        return myObject;
    }
}