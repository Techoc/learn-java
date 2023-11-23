package cn.techoc.dynamicdatasourcejdbctemplate.entity;

import lombok.Data;

@Data
public class UserDO {

    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 账号
     */
    private String username;
}
