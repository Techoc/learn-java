package cn.techoc.dynamicdatasourcemybatis;

import cn.techoc.dynamicdatasourcemybatis.entity.OrderDO;
import cn.techoc.dynamicdatasourcemybatis.mapper.orders.OrderMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderMapperTest {

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testSelectById() {
        OrderDO order = orderMapper.selectById(1);
        System.out.println(order);
    }

}
