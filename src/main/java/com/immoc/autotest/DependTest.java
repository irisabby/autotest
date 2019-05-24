package com.immoc.autotest;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/4/30 16:34
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test2 run");
    }
}
