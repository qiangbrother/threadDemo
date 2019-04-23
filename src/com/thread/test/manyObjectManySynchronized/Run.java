/**
 * FileName: Run
 * Author:   99552
 * Date:     2018/5/15 11:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.thread.test.manyObjectManySynchronized;

public class Run {
    public static void main(String[] args) {
        MethodVarSafe safe = new MethodVarSafe();
        MethodVarSafe safe1 = new MethodVarSafe();

        ThreadA a = new ThreadA(safe);
        a.start();
        ThreadB b = new ThreadB(safe);
        b.start();
    }
}
