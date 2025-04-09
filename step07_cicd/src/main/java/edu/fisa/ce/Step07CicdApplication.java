package edu.fisa.ce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}) 
public class Step07CicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step07CicdApplication.class, args);
	}
}
