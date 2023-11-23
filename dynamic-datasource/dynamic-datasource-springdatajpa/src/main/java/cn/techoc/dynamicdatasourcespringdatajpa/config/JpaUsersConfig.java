package cn.techoc.dynamicdatasourcespringdatajpa.config;

import jakarta.annotation.Resource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Map;

import static cn.techoc.dynamicdatasourcespringdatajpa.constant.DBConstants.ENTITY_MANAGER_FACTORY_USERS;
import static cn.techoc.dynamicdatasourcespringdatajpa.constant.DBConstants.TX_MANAGER_USERS;

@Configuration
@EnableJpaRepositories(
        entityManagerFactoryRef = ENTITY_MANAGER_FACTORY_USERS,
        transactionManagerRef = TX_MANAGER_USERS,
        basePackages = {"cn.techoc.dynamicdatasourcespringdatajpa.Repository.users"}) // 设置 Repository 接口所在包
public class JpaUsersConfig {

    @Resource(name = "hibernateVendorProperties")
    private Map<String, Object> hibernateVendorProperties;

    /**
     * 创建 users 数据源
     */
    @Bean(name = "usersDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.users")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 创建 LocalContainerEntityManagerFactoryBean
     */
    @Bean(name = ENTITY_MANAGER_FACTORY_USERS)
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(this.dataSource()) // 数据源
                .properties(hibernateVendorProperties) // 获取并注入 Hibernate Vendor 相关配置
                .packages("cn.techoc.dynamicdatasourcespringdatajpa.entity") // 数据库实体 entity 所在包
                .persistenceUnit("usersPersistenceUnit") // 设置持久单元的名字，需要唯一
                .build();
    }

    /**
     * 创建 PlatformTransactionManager
     */
    @Bean(name = TX_MANAGER_USERS)
    public PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactory(builder).getObject());
    }

}
