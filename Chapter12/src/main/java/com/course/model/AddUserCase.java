package com.course.model;

import lombok.Data;

/**
 * Created by Administrator on 2019/5/20 11:33
 */
@Data
public class AddUserCase {
    private String userName;
    private String password;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private Boolean expected;
}
