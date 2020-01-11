package com.ning.springboot.DbPojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CarList {//购物车类
    @Id
    @Column(columnDefinition = "integer comment 'id'")
    private int id;
    @Column(columnDefinition = "varchar(20) comment '用户id'")
    private String account;//用户id
    @Column(columnDefinition = "integer comment '商品id'")
    private int gId;
    @Column(columnDefinition = "integer comment '商品数量'")
    private int num;
}
