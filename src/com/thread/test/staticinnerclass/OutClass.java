
package com.thread.test.staticinnerclass;

/**

* @Description:    静态内部类
* @Author:         JackQiang
* @CreateDate:     2019/4/22 14:51
* @UpdateRemark:
*/
public class OutClass {

    static class Inner{

        public void method1(){
            synchronized ("其他"){
                for (int i=0;i<9;i++){
                    System.out.println(Thread.currentThread().getName()+" i = "+i);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void method2(){
            for (int i=0;i<9;i++){
                System.out.println(Thread.currentThread().getName()+" j = "+i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
