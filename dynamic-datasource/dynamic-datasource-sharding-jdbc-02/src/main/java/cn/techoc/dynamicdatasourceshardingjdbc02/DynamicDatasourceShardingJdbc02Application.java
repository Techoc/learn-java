package cn.techoc.dynamicdatasourceshardingjdbc02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan(basePackages = "cn.techoc.dynamicdatasourceshardingjdbc02.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class DynamicDatasourceShardingJdbc02Application {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceShardingJdbc02Application.class, args);
    }

}
