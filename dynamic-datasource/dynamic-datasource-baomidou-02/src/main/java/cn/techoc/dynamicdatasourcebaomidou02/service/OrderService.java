package cn.techoc.dynamicdatasourcebaomidou02.service;

import cn.techoc.dynamicdatasourcebaomidou02.entity.OrderDO;
import cn.techoc.dynamicdatasourcebaomidou02.mapper.OrderMapper;
import com.baomidou.dynamic.datasource.annotation.DS;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Transactional
    @DS("master")
    public void add(OrderDO order) {
        // 这里先假模假样的读取一下
        orderMapper.selectById(order.getId());

        // 插入订单
        orderMapper.insert(order);
    }

    public OrderDO findById(Integer id) {
        return orderMapper.selectById(id);
    }

}
