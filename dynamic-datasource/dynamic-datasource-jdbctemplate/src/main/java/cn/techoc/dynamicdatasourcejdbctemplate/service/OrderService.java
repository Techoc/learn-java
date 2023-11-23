package cn.techoc.dynamicdatasourcejdbctemplate.service;

import cn.techoc.dynamicdatasourcejdbctemplate.constant.DBConstants;
import cn.techoc.dynamicdatasourcejdbctemplate.dao.OrderDao;
import cn.techoc.dynamicdatasourcejdbctemplate.dao.UserDao;
import cn.techoc.dynamicdatasourcejdbctemplate.entity.OrderDO;
import cn.techoc.dynamicdatasourcejdbctemplate.entity.UserDO;
import jakarta.annotation.Resource;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private UserDao userDao;

    private OrderService self() {
        return (OrderService) AopContext.currentProxy();
    }

    public void method01() {
        // 查询订单
        OrderDO order = orderDao.selectById(1);
        System.out.println(order);
        // 查询用户
        UserDO user = userDao.selectById(1);
        System.out.println(user);
    }

    @Transactional // 报错，找不到事务管理器
    public void method02() {
        // 查询订单
        OrderDO order = orderDao.selectById(1);
        System.out.println(order);
        // 查询用户
        UserDO user = userDao.selectById(1);
        System.out.println(user);
    }

    public void method03() {
        // 查询订单
        self().method031();
        // 查询用户
        self().method032();
    }

    @Transactional(transactionManager = DBConstants.TX_MANAGER_ORDERS)
    public void method031() {
        OrderDO order = orderDao.selectById(1);
        System.out.println(order);
    }

    @Transactional(transactionManager = DBConstants.TX_MANAGER_USERS)
    public void method032() {
        UserDO user = userDao.selectById(1);
        System.out.println(user);
    }

    @Transactional(transactionManager = DBConstants.TX_MANAGER_ORDERS)
    public void method05() {
        // 查询订单
        OrderDO order = orderDao.selectById(1);
        System.out.println(order);
        // 查询用户
        self().method052();
    }

    @Transactional(transactionManager = DBConstants.TX_MANAGER_USERS,
            propagation = Propagation.REQUIRES_NEW)
    public void method052() {
        UserDO user = userDao.selectById(1);
        System.out.println(user);
    }

}
