/**
 * FileName: ReturnInterruptThread
 * Author:   99552
 * Date:     2018/5/14 15:47
 * Description: 通过return来讲线程终止
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.returnInterrupt;

public class ReturnInterruptThread extends Thread{
    @Override
    public void run() {
        while (true){
            if(this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("当前时间"+System.currentTimeMillis());
        }
    }
}
