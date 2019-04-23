/**
 * FileName: Run
 * Author:   99552
 * Date:     2018/5/14 15:49
 * Description: 执行类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.returnInterrupt;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        ReturnInterruptThread thread = new ReturnInterruptThread();
        thread.start();
        ReturnInterruptThread.sleep(1000);
        thread.interrupt();
    }

}
