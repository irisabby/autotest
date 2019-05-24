package com.immoc.autotest;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/5/5 19:09
 */
public class TimeOutTest {
    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
