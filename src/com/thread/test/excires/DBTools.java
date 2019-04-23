package com.thread.test.excires;
/**

* @Description:    wait/notify交叉打印
* @Author:         JackQiang
* @CreateDate:     2019/4/23 16:23
* @UpdateRemark:
*/
public class DBTools {

    private boolean flag = false;

    synchronized public void backupA(){
            try {
                while (flag == true){
                    wait();
                }
                for (int i=0;i<5;i++){
                    System.out.println("👆👆👆👆👆");
                }
                flag = true;
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    synchronized public void backupB(){
        try {
            while (flag == false){
                wait();
            }
            for (int i=0;i<5;i++){
                System.out.println("👇👇👇👇👇");
            }
            flag = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}