package cn.techoc.dynamicdatasourcejdbctemplate;

import cn.techoc.dynamicdatasourcejdbctemplate.dao.OrderDao;
import cn.techoc.dynamicdatasourcejdbctemplate.entity.OrderDO;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderDaoTest {

    @Resource
    private OrderDao orderDao;

    @Test
    public void testSelectById() {
        OrderDO order = orderDao.selectById(1);
        System.out.println(order);
    }

}
