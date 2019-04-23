/**
 * FileName: MethodVarSafe
 * Author:   99552
 * Date:     2018/5/15 10:57
 * Description: 方法中的变量线性安全
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.manyObjectManySynchronized;

public class MethodVarSafe {
    private  int num = 0;
   synchronized public void addI(String name) throws InterruptedException {

        if(name.equals("a")){
            num = 100;
            System.out.println("a set over");
            Thread.sleep(100);
        }else{
            num = 200;
            System.out.println("b set over");
        }

        System.out.println("name:"+name+" "+"num:"+num);
    }
}
