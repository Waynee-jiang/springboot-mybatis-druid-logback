package pers.lyks.spring.boot.pool;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author lawyerance
 * @version 1.0 2017-05-20
 */
@Configuration
// prefix = value,看源码
@ConfigurationProperties(prefix = "dataSource")
@PropertySource("classpath:druid-jdbc.properties")
@Component
public class DruidDataSourceConfig {

}
