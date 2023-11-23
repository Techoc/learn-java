package cn.techoc.dynamicdatasourcejdbctemplate.dao;

import cn.techoc.dynamicdatasourcejdbctemplate.constant.DBConstants;
import cn.techoc.dynamicdatasourcejdbctemplate.entity.UserDO;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Resource(name = DBConstants.JDBC_TEMPLATE_USERS)
    private JdbcTemplate template;

    public UserDO selectById(Integer id) {
        return template.queryForObject("SELECT id, username FROM users WHERE id = ?",
                new BeanPropertyRowMapper<>(UserDO.class), // 结果转换成对应的对象
                id);
    }

}
