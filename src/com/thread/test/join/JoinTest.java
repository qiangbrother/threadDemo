package com.thread.test.join;
/**

* @Description:    join方法使用
* @Author:         JackQiang
* @CreateDate:     2019/4/24 10:24
* @UpdateRemark:
*/
public class JoinTest extends Thread{

    @Override
    public void run() {
        try {
            int  time =   (int) (Math.random()*10000);
            System.out.println("join test ========" + time);
            System.out.println(System.currentTimeMillis());

            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {

        JoinTest joinTest = new JoinTest();
        joinTest.start();
        joinTest.join();
        System.out.println("=======");
        System.out.println(System.currentTimeMillis());
    }
}