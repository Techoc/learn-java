package cn.techoc.dynamicdatasourcemybatis;

import cn.techoc.dynamicdatasourcemybatis.entity.UserDO;
import cn.techoc.dynamicdatasourcemybatis.mapper.users.UserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;

@Resource
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelectById() {
        UserDO user = userMapper.selectById(1);
        System.out.println(user);
    }

}