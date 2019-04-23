
package com.thread.test.stringconstantpoolsync;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/22 14:11
* @UpdateRemark:
*/
public class Service {

    public static void print(String strParam){

        synchronized (strParam){
            try {
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
