/**
 * FileName: ThreadA
 * Author:   99552
 * Date:     2019/4/22 14:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名  99552  修改时间   2019/4/22 14:13          版本号   描述
 */
package com.thread.test.stringconstantpoolsync;

/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/22 14:13
* @UpdateRemark:
*/
public class ThreadA extends Thread{

    private Service service;

    public ThreadA (Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.print("AA");
    }
}
