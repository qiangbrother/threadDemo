package com.thread.test.singlepattern.meun;
/**

* @Description:    使用静态代码来创建单利
* @Author:         JackQiang
* @CreateDate:     2019/4/26 9:50
* @UpdateRemark:
*/
public class MyObject {

    public enum EnumMyObject{
        NAME;
    }

    public EnumMyObject getName(){
        return EnumMyObject.NAME;
    }


}