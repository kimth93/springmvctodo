package kr.ac.skuniv.springmvctodo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.mysql.jdbc.Driver;

@Configuration
@ComponentScan(basePackages={"kr.ac.skuniv.springmvctodo.service","kr.ac.skuniv.springmvctodo.dao"})
@Import({MybatisConfig.class})	//하나로 써도 되지만 유연성을 위해 분리
public class ApplicationConfig {
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(Driver.class); //pom의
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/skudb?serverTimezone=UTC");
		dataSource.setUsername("sku");
		dataSource.setPassword("sku");
		return dataSource;
		
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

}
