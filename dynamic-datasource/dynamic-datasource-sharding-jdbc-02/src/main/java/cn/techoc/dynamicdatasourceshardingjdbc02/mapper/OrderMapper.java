package cn.techoc.dynamicdatasourceshardingjdbc02.mapper;

import cn.techoc.dynamicdatasourceshardingjdbc02.entity.OrderDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    OrderDO selectById(@Param("id") Integer id);

    int insert(OrderDO entity);

}