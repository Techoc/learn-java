package cn.techoc.dynamicdatasourcebaomidou02.mapper;

// OrderMapper.java

import cn.techoc.dynamicdatasourcebaomidou02.entity.OrderDO;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    @DS("slave")
    OrderDO selectById(@Param("id") Integer id);

    @DS("master")
    int insert(OrderDO entity);

}
