package cn.techoc.datasourcepoolhikaricpmultiple;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
@Slf4j
public class DatasourcePoolHikaricpMultipleApplication implements CommandLineRunner {


    @Resource(name = "ordersDataSource")
    private DataSource ordersDataSource;

    @Resource(name = "usersDataSource")
    private DataSource usersDataSource;

    public static void main(String[] args) {
        // 启动 Spring Boot 应用
        SpringApplication.run(DatasourcePoolHikaricpMultipleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // orders 数据源
        try (Connection conn = ordersDataSource.getConnection()) {
            // 这里，可以做点什么
            log.info("[run][ordersDataSource 获得连接：{}]", conn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // users 数据源
        try (Connection conn = usersDataSource.getConnection()) {
            // 这里，可以做点什么
            log.info("[run][usersDataSource 获得连接：{}]", conn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}


