package com.thread.test.inheritablethreadlocal;

import java.util.Date;

/**

* @Description:
* @Author:         JackQiang
* @CreateDate:     2019/4/24 15:12
* @UpdateRemark:
*/
public class InheritableThreadLocalExtend extends InheritableThreadLocal{

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return "子线程获取的值";
    }
}