package kr.lifesymantics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
 * DataSource에 대한 구현체를 직접등록해야 되기 때문에 아래와 같이 DataSource 및 TransactionManager에 대한 자동설정을 제외하여야 한다.
 * */
//@Configuration
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
//@ComponentScan
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AfterCareApplication {
	public static void main(String[] args) {
		SpringApplication.run(AfterCareApplication.class, args);
	}
}
