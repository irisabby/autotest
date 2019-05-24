package com.course.model;

import lombok.Data;

/**
 * Created by Administrator on 2019/5/21 11:35
 */
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;
}
