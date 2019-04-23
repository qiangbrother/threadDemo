/**
 * FileName: ThreadB
 * Author:   99552
 * Date:     2018/5/15 11:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.staticsynchronized;


public class ThreadB extends Thread{
    @Override
    public void run() {

        StaticService.testMethod();
    }

}
