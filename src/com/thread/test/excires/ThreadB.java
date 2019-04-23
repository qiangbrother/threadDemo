package com.thread.test.excires;
/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/23 16:31
* @UpdateRemark:
*/
public class ThreadB extends Thread{

    private DBTools dbTools;

    public ThreadB(DBTools dbTools){
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backupB();
    }
}