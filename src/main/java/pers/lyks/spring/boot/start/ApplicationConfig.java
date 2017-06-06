package pers.lyks.spring.boot.start;//package pers.lyks.spring.boot.start;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.StringHttpMessageConverter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//import javax.annotation.Resource;
//import java.nio.charset.Charset;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @author lawyerance
// * @version 1.0 2017-05-11
// */
//@Configuration
//@ComponentScan("pers.lyks")
//@EnableWebMvc
//@EnableTransactionManagement
////@PropertySource("classpath:application.properties")
//public class ApplicationConfig extends WebMvcConfigurerAdapter {
//
//    private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
//    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
//    private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
//    private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";
//
//    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
//    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
//    private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
//    private static final String PROPERTY_NAME_HIBERNATE_CONNECTION_CHARSET = "hibernate.connection.CharSet";
//    private static final String PROPERTY_NAME_HIBERNATE_CONNECTION_CHARACTERENCODING = "hibernate.connection.characterEncoding";
//    private static final String PROPERTY_NAME_HIBERNATE_CONNECTION_USEUNICODE = "hibernate.connection.useUnicode";
//    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN_SERVICES = "services.entitymanager.packages.to.scan";
//    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN_COMMON = "common.entitymanager.packages.to.scan";
//    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN_CMS = "cms.entitymanager.packages.to.scan";
//    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN_PROCEDURE = "procedure.entitymanager.packages.to.scan";
//
//    @Resource
//    private Environment env;
//
//    @Bean
////    public DataSource dataSource() {
////        DriverManagerDataSource dataSource = new DriverManagerDataSource();
////        dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
////        dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
////        dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
////        dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
////        return dataSource;
////    }
//
////    @Bean
////    public LocalSessionFactoryBean sessionFactory() {
////        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
////        sessionFactoryBean.setDataSource(dataSource());
////        //sessionFactoryBean.setPackagesToScan(env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
////        sessionFactoryBean.setPackagesToScan(new String[]{
////                env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN_SERVICES),
////                env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN_COMMON),
////                env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN_CMS),
////                env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN_PROCEDURE)
////        });
////        sessionFactoryBean.setHibernateProperties(hibProperties());
////        return sessionFactoryBean;
////    }
//
////    private Properties hibProperties() {
////        Properties properties = new Properties();
////        properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
////        properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
////        properties.put(PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO));
////        properties.put(PROPERTY_NAME_HIBERNATE_CONNECTION_CHARSET, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_CONNECTION_CHARSET));
////        properties.put(PROPERTY_NAME_HIBERNATE_CONNECTION_CHARACTERENCODING, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_CONNECTION_CHARACTERENCODING));
////        properties.put(PROPERTY_NAME_HIBERNATE_CONNECTION_USEUNICODE, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_CONNECTION_USEUNICODE));
////        properties.put("jadira.usertype.autoRegisterUserTypes", "true");
////        return properties;
////    }
////
////    @Bean
////    public HibernateTransactionManager transactionManager() {
////        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
////        transactionManager.setSessionFactory(sessionFactory().getObject());
////        return transactionManager;
////    }
//
//
//    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//        // Simple strategy: only path extension is taken into account
//        configurer.favorPathExtension(true).
//                ignoreAcceptHeader(true).
//                useJaf(false).
//                defaultContentType(MediaType.TEXT_HTML).
//                mediaType("html", MediaType.TEXT_HTML).
//                mediaType("xml", MediaType.APPLICATION_XML).
//                mediaType("json", MediaType.APPLICATION_JSON);
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/img/*");
//        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/*");
//        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/*");
//        registry.addResourceHandler("/lib/**").addResourceLocations("/WEB-INF/lib/*");
//    }
//
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//        converters.add(responseBodyConverter());
//    }
//
//    @Bean
//    public HttpMessageConverter<String> responseBodyConverter() {
//        StringHttpMessageConverter converter = new StringHttpMessageConverter();
//        converter.setSupportedMediaTypes(Arrays.asList(new MediaType("text", "plain", Charset.forName("UTF-8"))));
//        return converter;
//    }
//}
