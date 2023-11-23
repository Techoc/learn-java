package cn.techoc.dynamicdatasourceshardingjdbc02;

import cn.techoc.dynamicdatasourceshardingjdbc02.entity.OrderDO;
import cn.techoc.dynamicdatasourceshardingjdbc02.service.OrderService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceTest {

    @Resource
    private OrderService orderService;

    @Test
    public void testAdd() {
        OrderDO order = new OrderDO();
        order.setUserId(20);
        orderService.add(order);
    }

    @Test
    public void testFindById() {
        OrderDO order = orderService.findById(1);
        System.out.println(order);
    }

}
