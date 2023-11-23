package cn.techoc.dynamicdatasourcejdbctemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class DynamicDatasourceJdbctemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceJdbctemplateApplication.class, args);
    }

}
