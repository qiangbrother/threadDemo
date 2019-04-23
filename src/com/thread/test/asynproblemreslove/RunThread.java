
package com.thread.test.asynproblemreslove;
/**

* @Description:    异步问题解决
* @Author:         JackQiang
* @CreateDate:     2019/4/22 15:33
* @UpdateRemark:
*/
public class RunThread extends Thread{

    private boolean flag = true;

    public boolean flag(){
        return flag;
    }

    public void isFlag(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        System.out.println("进入了run线程");
        while (flag == true){}
        System.out.println("结束run线程");
    }
}
