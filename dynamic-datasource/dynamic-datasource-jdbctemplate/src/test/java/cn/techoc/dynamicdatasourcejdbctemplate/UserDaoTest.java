package cn.techoc.dynamicdatasourcejdbctemplate;

import cn.techoc.dynamicdatasourcejdbctemplate.dao.UserDao;
import cn.techoc.dynamicdatasourcejdbctemplate.entity.UserDO;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testSelectById() {
        UserDO user = userDao.selectById(1);
        System.out.println(user);
    }

}
