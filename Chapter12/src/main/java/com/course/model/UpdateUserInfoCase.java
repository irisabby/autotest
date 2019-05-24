package com.course.model;

import lombok.Data;

/**
 * Created by Administrator on 2019/5/20 18:40
 */
@Data
public class UpdateUserInfoCase {
    private String id;
    private String userId;
    private String userName;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
}
