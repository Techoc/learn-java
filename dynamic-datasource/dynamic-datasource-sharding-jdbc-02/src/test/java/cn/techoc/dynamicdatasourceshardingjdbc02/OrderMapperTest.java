package cn.techoc.dynamicdatasourceshardingjdbc02;

import cn.techoc.dynamicdatasourceshardingjdbc02.entity.OrderDO;
import cn.techoc.dynamicdatasourceshardingjdbc02.mapper.OrderMapper;
import jakarta.annotation.Resource;
import org.apache.shardingsphere.infra.hint.HintManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderMapperTest {

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testSelectById() { // 测试从库的负载均衡
        for (int i = 0; i < 10; i++) {
            OrderDO order = orderMapper.selectById(1);
            System.out.println(order);
        }
    }

    @Test
    public void testSelectById02() { // 测试强制访问主库
        try (HintManager hintManager = HintManager.getInstance()) {
            // 设置强制访问主库
            hintManager.setWriteRouteOnly();
            // 执行查询
            OrderDO order = orderMapper.selectById(1);
            System.out.println(order);
        }
    }

    @Test
    public void testInsert() { // 插入
        OrderDO order = new OrderDO();
        order.setUserId(10);
        orderMapper.insert(order);
    }

}
