package com.immoc.autotest.groups;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/4/29 18:46
 */
@Test(groups="stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass11111中的stu1111111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass11111中的stu22222222运行");
    }
}
