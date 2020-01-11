package com.ning.springboot.DbPojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {//用户类

    @Id
    @Column(columnDefinition = "varchar(20) comment '账号（不可重复）'")
    private String account;
    @Column(columnDefinition = "varchar(10) comment '昵称'")
    private String nikeName;
    @Column(columnDefinition = "varchar(18) comment '密码'")
    private String password;
    @Column(columnDefinition = "varchar(2) default '' comment '性别(先生、女士)'")
    private String sex;
}
