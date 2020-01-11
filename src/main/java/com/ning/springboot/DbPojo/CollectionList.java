package com.ning.springboot.DbPojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CollectionList {//收藏类
    @Id
    @Column(columnDefinition = "integer comment 'id'")
    private int id;
    @Column(columnDefinition = "varchar(20) comment '用户id'")
    private String account;
    @Column(columnDefinition = "integer comment '商品id'")
    private int gId;
}
