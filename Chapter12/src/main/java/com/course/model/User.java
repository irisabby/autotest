package com.course.model;

import lombok.Data;

/**
 * Created by Administrator on 2019/5/17 17:19
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

    public String toString(){
        return("{id:"+id+","+
                "userName:"+userName+","+
                "password:"+password+","+
                "age:"+age+","+
                "sex:"+sex+","+
                "permission:"+permission+","+
                "isDelete:"+isDelete+"}"
        );
    }
}
