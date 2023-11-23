package cn.techoc.dynamicdatasourcespringdatajpa.Repository.orders;

import cn.techoc.dynamicdatasourcespringdatajpa.entity.OrderDO;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderDO, Integer> {
}
