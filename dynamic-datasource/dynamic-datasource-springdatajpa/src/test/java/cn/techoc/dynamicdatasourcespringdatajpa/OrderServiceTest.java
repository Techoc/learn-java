package cn.techoc.dynamicdatasourcespringdatajpa;

import cn.techoc.dynamicdatasourcespringdatajpa.service.OrderService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceTest {

    @Resource
    private OrderService orderService;

    @Test
    public void testMethod01() {
        orderService.method01();
    }

    @Test
    public void testMethod02() {
        orderService.method02();
    }

    @Test
    public void testMethod03() {
        orderService.method03();
    }

    @Test
    public void testMethod05() {
        orderService.method05();
    }

}
