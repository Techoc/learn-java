package cn.techoc.dynamicdatasourceshardingjdbc01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan(basePackages = "cn.techoc.dynamicdatasourceshardingjdbc01.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class DynamicDatasourceShardingJdbc01Application {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceShardingJdbc01Application.class, args);
    }

}
