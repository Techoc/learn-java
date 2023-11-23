package cn.techoc.dynamicdatasourcemybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class DynamicDatasourceMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceMybatisApplication.class, args);
    }

}
