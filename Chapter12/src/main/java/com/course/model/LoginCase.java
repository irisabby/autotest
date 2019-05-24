package com.course.model;

import lombok.Data;

/**
 * Created by Administrator on 2019/5/20 15:44
 */
@Data
public class LoginCase {
    private String userName;
    private String password;
    private Boolean expected;
}
