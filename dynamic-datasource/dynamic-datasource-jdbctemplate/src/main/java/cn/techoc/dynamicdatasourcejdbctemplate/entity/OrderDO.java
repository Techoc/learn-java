package cn.techoc.dynamicdatasourcejdbctemplate.entity;

import lombok.Data;

@Data
public class OrderDO {

    /**
     * 订单编号
     */
    private Integer id;
    /**
     * 用户编号
     */
    private Integer userId;
}
