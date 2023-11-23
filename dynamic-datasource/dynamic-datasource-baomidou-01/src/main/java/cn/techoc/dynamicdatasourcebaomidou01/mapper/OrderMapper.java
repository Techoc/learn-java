package cn.techoc.dynamicdatasourcebaomidou01.mapper;

import cn.techoc.dynamicdatasourcebaomidou01.entity.OrderDO;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@DS("orders")
public interface OrderMapper {

    OrderDO selectById(@Param("id") Integer id);

}
