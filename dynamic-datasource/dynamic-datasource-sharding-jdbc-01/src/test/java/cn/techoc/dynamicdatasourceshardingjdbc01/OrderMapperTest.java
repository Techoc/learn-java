package cn.techoc.dynamicdatasourceshardingjdbc01;

import cn.techoc.dynamicdatasourceshardingjdbc01.entity.OrderDO;
import cn.techoc.dynamicdatasourceshardingjdbc01.mapper.orders.OrderMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderMapperTest {

    @Resource
    private OrderMapper orderMapper;

    /**
     * 通过id选择订单信息并打印
     */
    @Test
    public void testSelectById() {
        // 调用orderMapper的selectById方法，传入参数1，获取指定id的订单信息
        OrderDO order = orderMapper.selectById(1);
        // 打印订单信息
        System.out.println(order);
    }


}
