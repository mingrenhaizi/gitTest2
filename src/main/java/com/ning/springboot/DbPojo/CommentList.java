package com.ning.springboot.DbPojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CommentList {//商品评论类
    @Id
    @Column(columnDefinition = "integer comment 'id'")
    private int id;
    @Column(columnDefinition = "integer comment '商品id'")
    private int gId;
    @Column(columnDefinition = "varchar(50) comment '商品评论'")
    private String comment;
}
