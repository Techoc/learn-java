package cn.techoc.dynamicdatasourcebaomidou01;

import cn.techoc.dynamicdatasourcebaomidou01.entity.OrderDO;
import cn.techoc.dynamicdatasourcebaomidou01.mapper.OrderMapper;
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
