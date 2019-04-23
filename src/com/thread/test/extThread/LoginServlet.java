/**
 * FileName: LoginServlet
 * Author:   99552
 * Date:     2018/5/11 14:30
 * Description: 模拟servlert
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.extThread;

public class LoginServlet {

    private static String name;
    private static String password;

    public static void doPost(String name1,String password1){
        try {
        name = name1;

        if(name.equals("a")){
            Thread.sleep(5000);
        }

            System.out.println("用户名"+name+"  "+"密码"+password1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
