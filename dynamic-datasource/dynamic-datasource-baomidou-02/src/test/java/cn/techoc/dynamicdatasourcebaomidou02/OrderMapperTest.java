package cn.techoc.dynamicdatasourcebaomidou02;

import cn.techoc.dynamicdatasourcebaomidou02.entity.OrderDO;
import cn.techoc.dynamicdatasourcebaomidou02.mapper.OrderMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderMapperTest {

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testSelectById() {
        for (int i = 0; i < 10; i++) {
            OrderDO order = orderMapper.selectById(1);
            System.out.println(order);
        }
    }

    @Test
    public void testInsert() {
        OrderDO order = new OrderDO();
        order.setUserId(10);
        orderMapper.insert(order);
    }

}
