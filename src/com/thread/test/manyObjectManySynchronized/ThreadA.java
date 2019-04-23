/**
 * FileName: ThreadA
 * Author:   99552
 * Date:     2018/5/15 11:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.manyObjectManySynchronized;

public class ThreadA extends Thread{
    private MethodVarSafe methodVarSafe;
    @Override
    public void run() {
        try {
            methodVarSafe.addI("a");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ThreadA(MethodVarSafe methodVarSafe) {
        this.methodVarSafe = methodVarSafe;
    }
}
