package cn.techoc.dynamicdatasourceshardingjdbc02.service;

import cn.techoc.dynamicdatasourceshardingjdbc02.entity.OrderDO;
import cn.techoc.dynamicdatasourceshardingjdbc02.mapper.OrderMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Transactional
    public void add(OrderDO order) {
        // <1.1> 这里先假模假样的读取一下。读取从库
        OrderDO exists = orderMapper.selectById(1);
        System.out.println(exists);

        // <1.2> 插入订单
        orderMapper.insert(order);

        // <1.3> 这里先假模假样的读取一下。读取主库
        exists = orderMapper.selectById(1);
        System.out.println("主库" + exists);
    }

    public OrderDO findById(Integer id) {
        return orderMapper.selectById(id);
    }

}
