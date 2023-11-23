package cn.techoc.dynamicdatasourcespringdatajpa.Repository.users;

import cn.techoc.dynamicdatasourcespringdatajpa.entity.UserDO;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDO, Integer> {
}
