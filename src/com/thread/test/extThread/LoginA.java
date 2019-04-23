/**
 * FileName: LoginA
 * Author:   99552
 * Date:     2018/5/11 14:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.extThread;

public class LoginA extends Thread{

    @Override
    public void run() {

        LoginServlet.doPost("a","aaa");
    }
}
