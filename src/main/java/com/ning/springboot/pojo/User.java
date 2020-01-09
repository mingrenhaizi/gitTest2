package com.ning.springboot.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "account")
    private String account;

    @Column(name = "nikeName")
    private String nikeName;

    @Column(name = "password")
    private String password;

}
