package com.ning.springboot.DbPojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Good {//商品类
    @Id
    @GeneratedValue
    @Column(columnDefinition = "integer comment 'id'")
    private int gId;
    @Column(columnDefinition = "varchar(20) comment '卖家id'")
    private String account;
    @Column(columnDefinition = "varchar(20) comment '商品名称'")
    private String name;
    @Column(columnDefinition = "varchar(10) comment '商品类型（标签）'")
    private String type;
    @Column(columnDefinition = "varchar(50) comment '商品描述'")
    private String detail;
    @Column(columnDefinition = "double comment '价格'")
    private double price;
    @Column(columnDefinition = "varchar(50) comment '图片地址'")
    private String picDir;
}
