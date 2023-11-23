package cn.techoc.dynamicdatasourceshardingjdbc01.service;

import cn.techoc.dynamicdatasourceshardingjdbc01.entity.OrderDO;
import cn.techoc.dynamicdatasourceshardingjdbc01.entity.UserDO;
import cn.techoc.dynamicdatasourceshardingjdbc01.mapper.orders.OrderMapper;
import cn.techoc.dynamicdatasourceshardingjdbc01.mapper.users.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private UserMapper userMapper;

    private OrderService self() {
        return (OrderService) AopContext.currentProxy();
    }

    public void method01() {
        // 查询订单
        OrderDO order = orderMapper.selectById(1);
        System.out.println(order);
        // 查询用户
        UserDO user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Transactional
    public void method02() {
        // 查询订单
        OrderDO order = orderMapper.selectById(1);
        System.out.println(order);
        // 查询用户
        UserDO user = userMapper.selectById(1);
        System.out.println(user);
    }

    public void method03() {
        // 查询订单
        self().method031();
        // 查询用户
        self().method032();
    }

    @Transactional
    public void method031() {
        OrderDO order = orderMapper.selectById(1);
        System.out.println(order);
    }

    @Transactional
    public void method032() {
        UserDO user = userMapper.selectById(1);
        System.out.println(user);
    }

    public void method04() {
        // 查询订单
        self().method041();
        // 查询用户
        self().method042();
    }

    @Transactional
    public void method041() {
        OrderDO order = orderMapper.selectById(1);
        System.out.println(order);
    }

    @Transactional
    public void method042() {
        UserDO user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Transactional
    public void method05() {
        // 查询订单
        OrderDO order = orderMapper.selectById(1);
        System.out.println(order);
        // 查询用户
        self().method052();
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW)
    public void method052() {
        UserDO user = userMapper.selectById(1);
        System.out.println(user);
    }

}
