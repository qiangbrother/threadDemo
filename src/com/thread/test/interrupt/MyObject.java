/**
 * FileName: MyObject
 * Author:   99552
 * Date:     2018/5/14 14:20
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.interrupt;

public class MyObject {
    private String  name ="11";
    private String password = "11";

    public void setValue(String u,String p){
        this.name = u;
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("暂停a线程");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernameAndPassword(){
        System.out.println("name:"+name+"  "+"password:"+password);
    }

}
