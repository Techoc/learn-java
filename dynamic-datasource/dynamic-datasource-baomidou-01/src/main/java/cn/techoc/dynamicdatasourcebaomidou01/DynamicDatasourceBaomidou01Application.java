package cn.techoc.dynamicdatasourcebaomidou01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("cn.techoc.dynamicdatasourcebaomidou01.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class DynamicDatasourceBaomidou01Application {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceBaomidou01Application.class, args);
    }

}
