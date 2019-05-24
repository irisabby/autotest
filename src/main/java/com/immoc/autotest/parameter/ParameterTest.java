package com.immoc.autotest.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/4/30 16:47
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void ParameterTest1(String name,int age){
        System.out.println("name =" +name + ", age ="+age);
    }
}
