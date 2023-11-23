package cn.techoc.dynamicdatasourcebaomidou01;

import cn.techoc.dynamicdatasourcebaomidou01.entity.UserDO;
import cn.techoc.dynamicdatasourcebaomidou01.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelectById() {
        UserDO user = userMapper.selectById(1);
        System.out.println(user);
    }

}