package cn.techoc.dynamicdatasourcespringdatajpa;

import cn.techoc.dynamicdatasourcespringdatajpa.Repository.users.UserRepository;
import cn.techoc.dynamicdatasourcespringdatajpa.entity.UserDO;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Test
    public void testSelectById() {
        UserDO user = userRepository.findById(1)
                .orElse(null);
        System.out.println(user);
    }

}