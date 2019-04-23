package com.thread.test.excires;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/23 16:31
* @UpdateRemark:
*/
public class ThreadA extends Thread{

    private DBTools dbTools;

    public ThreadA(DBTools dbTools){
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backupA();
    }
}