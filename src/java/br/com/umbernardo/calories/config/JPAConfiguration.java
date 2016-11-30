/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author umbernardo
 */
@EnableTransactionManagement 
public class JPAConfiguration {
    
    private static final String PACKAGE_TO_SCAN = "br.com.umbernardo.calories.model";

    private static DriverManagerDataSource dataSource(){ 
    
    DriverManagerDataSource dataSource = new DriverManagerDataSource(); 
    dataSource.setUsername("root");
    dataSource.setPassword("root"); 
    dataSource.setUrl("jdbc:derby://localhost:1527/db-calories"); 
    dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver"); 
    
    return dataSource;
}
private static Properties properties() {
    Properties props = new Properties();
    props.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect"); 
    props.setProperty("hibernate.show_sql", "true"); 
    props.setProperty("hibernate.hbm2ddl.auto","update");
    
    return props;
}
@Bean
public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
    LocalContainerEntityManagerFactoryBean factoryBean = 
            new LocalContainerEntityManagerFactoryBean();
    
    factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter()); 
    factoryBean.setDataSource(dataSource()); 
    factoryBean.setJpaProperties(properties()); 
    factoryBean.setPackagesToScan(PACKAGE_TO_SCAN);
    
    return factoryBean; 
}
@Bean
public JpaTransactionManager jpaTransactionManager(EntityManagerFactory emf) {
return new JpaTransactionManager(emf); }
}
