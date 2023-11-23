package cn.techoc.dynamicdatasourcespringdatajpa;

import cn.techoc.dynamicdatasourcespringdatajpa.Repository.orders.OrderRepository;
import cn.techoc.dynamicdatasourcespringdatajpa.entity.OrderDO;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderRepositoryTest {

    @Resource
    private OrderRepository orderRepository;

    @Test
    public void testSelectById() {
        OrderDO order = orderRepository.findById(1)
                .orElse(null); // 为空，则返回 null
        System.out.println(order);
    }

}
