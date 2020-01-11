package com.ning.springboot.DbPojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class OrderList {//订单商品类
    @Id
    @Column(columnDefinition = "integer comment 'id'")
    private int id;
    @Column(columnDefinition = "integer comment '订单id'")
    private int oId;
    @Column(columnDefinition = "integer comment '商品id'")
    private int gId;
    @Column(columnDefinition = "integer comment '数量'")
    private int num;
}
