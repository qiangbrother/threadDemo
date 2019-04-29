package com.thread.test.singlepattern.staticcode;
/**

* @Description:    使用静态代码来创建单利
* @Author:         JackQiang
* @CreateDate:     2019/4/26 9:50
* @UpdateRemark:
*/
public class MyObject {

    private static MyObject myObject ;

    static {
        myObject = new MyObject();
    }

    private MyObject(){}
    /**
     * 在调用类的时候就创建了实例
     * */
     public static MyObject getInstance(){
        return myObject;
    }
}