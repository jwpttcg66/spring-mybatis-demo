package com.snowcattle.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jiangwenping on 17/3/6.
 */
@Configuration
@MapperScan(value="com.snowcattle.demo.mapper")
public class AppConfig
{
	/*
	@Bean
	public DataSource dataSource() {
		return new PooledDataSource("com.mysql.jdbc.Driver",
									"jdbc:mysql://localhost:3306/elearning",
									"root", "admin");
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
	    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	    sessionFactory.setDataSource(dataSource());
	    return sessionFactory.getObject();
	}
	*/
}
