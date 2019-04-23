/**
 * FileName: LoginB
 * Author:   99552
 * Date:     2018/5/11 14:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.extThread;

public class LoginB extends Thread{
    @Override
    public void run() {

        LoginServlet.doPost("b","bb");
    }

    public static void main(String[] args) {
        LoginA a = new LoginA();
        a.start();
        LoginB b = new LoginB();
        b.start();
    }
}
