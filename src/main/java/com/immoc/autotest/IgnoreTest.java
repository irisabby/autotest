package com.immoc.autotest;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/4/29 18:11
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}
