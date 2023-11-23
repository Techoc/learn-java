package cn.techoc.jpa;

import cn.techoc.jpa.entity.User;
import cn.techoc.jpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest
class JpaApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(JpaApplicationTests.class);

    @Resource
    private UserRepository userRepository;

    @Test
    public void test() {
        User user = new User("techoc", "123456");
        user.setCreateTime(new Date());
        user = userRepository.save(user);
        log.info("[添加成功] - [{}]", user);
        final List<User> u1 = userRepository.findAllByUsername("u1");
        log.info("[条件查询] - [{}]", u1);
        Pageable pageable = PageRequest.of(0, 10, Sort.by(Sort.Order.desc("username")));
        final Page<User> users = userRepository.findAll(pageable);
        log.info("[分页+排序+查询所有] - [{}]", users.getContent());
        userRepository.findById(users.getContent().get(0).getId()).ifPresent(user1 -> log.info("[主键查询] - [{}]", user1));
    }

    @Test // 分页
    public void testFindPage() {
        // 创建排序条件
        Sort sort = Sort.by(Sort.Order.desc("id"));
        // 创建分页条件
        Pageable pageable = PageRequest.of(1, 10, sort);
        // 执行分页操作
        Page<User> page = userRepository.findAll(pageable);
        // 打印
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }

    @Test
    public void testFindByUsernameAndPassword() {
        // 创建分页条件
        Pageable pageable = PageRequest.of(1, 10);
        // 执行分页操作
        Page<User> page = userRepository.findByUsernameAndPassword("techoc", "123456", pageable);
        // 打印
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }

    @Test
    // 更新操作，需要在事务中。
    // 在单元测试中，事务默认回滚，所以胖友可能怎么测试，事务都不更新。
    @Transactional
    public void testUpdateUsernameById() {
        userRepository.updateUsernameById(2, "update username");
    }

}
