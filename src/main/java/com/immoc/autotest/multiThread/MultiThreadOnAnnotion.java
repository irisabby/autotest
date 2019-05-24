package com.immoc.autotest.multiThread;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/5/5 17:37
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
