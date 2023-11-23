package cn.techoc.datasourcepooldruidsingle;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
@Slf4j
public class DatasourcePoolDruidSingleApplication implements CommandLineRunner {
    @Resource
    private DataSource dataSource;


    @Override
    public void run(String... args) {
        log.info("[run][获得数据源：{}]", dataSource.getClass());
    }

    public static void main(String[] args) {
        SpringApplication.run(DatasourcePoolDruidSingleApplication.class, args);
    }

}
