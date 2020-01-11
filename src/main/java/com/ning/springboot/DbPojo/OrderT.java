package com.ning.springboot.DbPojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class OrderT {//订单类
    @Id
    @GeneratedValue
    @Column(columnDefinition = "integer comment 'oId'")
    private int oId;
    @Column(columnDefinition = "varchar(20) comment '用户id'")
    private String account;
    @Column(columnDefinition = "double comment '总价格'")
    private double price;
    @Column(columnDefinition = "varchar(17) comment '创建时间'")
    private String createTime;
}
