package cn.techoc.dynamicdatasourceshardingjdbc01;


import cn.techoc.dynamicdatasourceshardingjdbc01.entity.UserDO;
import cn.techoc.dynamicdatasourceshardingjdbc01.mapper.users.UserMapper;
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