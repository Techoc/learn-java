package cn.techoc.dynamicdatasourcemybatis.mapper.users;

import cn.techoc.dynamicdatasourcemybatis.entity.UserDO;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@DS("users")
public interface UserMapper {

    UserDO selectById(@Param("id") Integer id);

}
