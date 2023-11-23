package cn.techoc.dynamicdatasourceshardingjdbc01.mapper.users;

import cn.techoc.dynamicdatasourceshardingjdbc01.entity.UserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    UserDO selectById(@Param("id") Integer id);


}
