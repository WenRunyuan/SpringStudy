package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@Import({JdbcConfig.class})
@ComponentScan("com.itheima.dao")
public class SpringConfig {
}
