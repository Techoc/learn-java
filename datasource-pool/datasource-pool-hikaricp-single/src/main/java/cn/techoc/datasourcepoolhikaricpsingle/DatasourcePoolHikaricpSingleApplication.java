package cn.techoc.datasourcepoolhikaricpsingle;

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
public class DatasourcePoolHikaricpSingleApplication implements CommandLineRunner {

    @Resource
    private DataSource dataSource;

    public static void main(String[] args) {
        // 启动 Spring Boot 应用
        SpringApplication.run(DatasourcePoolHikaricpSingleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        try (Connection conn = dataSource.getConnection()) {
            // 这里，可以做点什么
            log.info("[run][获得连接：{}]", conn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
