package pers.lyks.spring.boot.config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * @author lawyerance
 * @version 1.0 2017-05-13
 */
@Configuration
//加上这个注解，使得支持事务
@EnableTransactionManagement
public class MyBatisConfig implements TransactionManagementConfigurer {
    private static final Logger logger = LoggerFactory.getLogger(MyBatisConfig.class);
    private static final String MYBATIS_CONFIG = "mybatis-config.xml";

    @Autowired
    private DataSource dataSource;

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory createSqlSessionFactory() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        if (null == dataSource) {
            throw new NullPointerException("The dataSource must not be null");
        }
        bean.setDataSource(dataSource);
        bean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
        try {
            return bean.getObject();
        } catch (Exception e) {
            throw new RuntimeException("Error getting the bean of 'sqlSessionFactory': ", e);
        }
    }

    @Bean
    public SqlSession sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}