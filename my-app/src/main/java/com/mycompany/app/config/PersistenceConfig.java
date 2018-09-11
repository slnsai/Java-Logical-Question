package com.mycompany.app.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import com.mycompany.app.model.Employee;

@Configuration
public class PersistenceConfig
{
	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean(autowire=Autowire.BY_TYPE)
	public LocalSessionFactoryBean localSessionFactoryBean()
	{
		LocalSessionFactoryBean factoryBean=null;
		Properties hibernateProperties=null;
		
		hibernateProperties=new Properties();
		hibernateProperties.setProperty("show_sql", "true");
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		
		factoryBean=new LocalSessionFactoryBean();
		
		factoryBean.setHibernateProperties(hibernateProperties);
		factoryBean.setAnnotatedClasses(Employee.class);

		return factoryBean;
	
		
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public HibernateTemplate hibernateTemplate()
	{
		return new HibernateTemplate();
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public PlatformTransactionManager transactionManager()
	{
		return new HibernateTransactionManager();
		
	}
	

}
