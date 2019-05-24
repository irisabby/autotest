package com.immoc.autotest.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by Administrator on 2019/4/29 17:14
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
