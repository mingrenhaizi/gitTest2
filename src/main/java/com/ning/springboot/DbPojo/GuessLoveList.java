package com.ning.springboot.DbPojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class GuessLoveList {//猜你喜欢类
    @Id
    @Column(columnDefinition = "integer comment 'id'")
    private int id;
    @Column(columnDefinition = "varchar(20) comment '用户id'")
    private String account;
    @Column(columnDefinition = "varchar(10) comment '喜欢的商品类型'")
    private String type;
    @Column(columnDefinition = "double comment '喜欢商品程度参数'")
    private double priority;//浏览0.1 收藏0.3 购买 1
}
