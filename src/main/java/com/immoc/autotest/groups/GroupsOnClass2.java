package com.immoc.autotest.groups;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/4/29 18:46
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2222中的stu1111111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2222中的stu22222222运行");
    }
}
