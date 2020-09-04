package cn.crabapples.common.config.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Configuration
public class DataSourceConfigure {

//    DruiddA

//    @Primary
//    @Bean(value = "firstDataSource")
//    @ConfigurationProperties("spring.datasource.druid.first")
//    public DataSource dataSourceOne() {
//        log.info("Init DataSourceOne");
//        DataSource dataSource = DruidDataSourceBuilder.create().build();
//        DynamicDataSourceContextHolder.dataSourceIds.add("firstDataSource");
//        return dataSource;
//    }
//
//    @Bean(value = "secondDataSource")
//    @ConfigurationProperties("spring.datasource.druid.second")
//    public DataSource dataSourceTwo() {
//        log.info("Init DataSourceTwo");
//        DataSource dataSource = DruidDataSourceBuilder.create().build();
//        DynamicDataSourceContextHolder.dataSourceIds.add("secondDataSource");
//        return dataSource;
//    }

}
