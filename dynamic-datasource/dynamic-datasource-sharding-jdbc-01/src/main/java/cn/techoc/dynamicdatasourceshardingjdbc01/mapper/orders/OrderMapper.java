package cn.techoc.dynamicdatasourceshardingjdbc01.mapper.orders;


import cn.techoc.dynamicdatasourceshardingjdbc01.entity.OrderDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    OrderDO selectById(@Param("id") Integer id);

}
