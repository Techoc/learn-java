package cn.techoc.dynamicdatasourcebaomidou02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("cn.techoc.dynamicdatasourcebaomidou02.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class DynamicDatasourceBaomidou02Application {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceBaomidou02Application.class, args);
    }

}
