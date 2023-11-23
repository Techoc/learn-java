package cn.techoc.datasourcepooldruidmultiple;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
@Slf4j
public class DatasourcePoolDruidMultipleApplication implements CommandLineRunner {


    @Resource(name = "ordersDataSource")
    private DataSource ordersDataSource;

    @Resource(name = "usersDataSource")
    private DataSource usersDataSource;

    @Override
    public void run(String... args) {
        // orders 数据源
        log.info("[run][获得数据源：{}]", ordersDataSource.getClass());

        // users 数据源
        log.info("[run][获得数据源：{}]", usersDataSource.getClass());
    }

    public static void main(String[] args) {
        SpringApplication.run(DatasourcePoolDruidMultipleApplication.class, args);
    }

}
