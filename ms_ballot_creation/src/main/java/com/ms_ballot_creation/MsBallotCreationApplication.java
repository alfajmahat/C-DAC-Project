package com.ms_ballot_creation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@EntityScan(basePackages = "com.ms_ballot_creation")
////@EntityScan(basePackages = "com.ms_ballot_creation.entity")
////@EnableJpaRepositories(basePackages = "com.ms_ballot_creation.repository")
public class MsBallotCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBallotCreationApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer configure()
	{
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry reg)
			{
				reg.addMapping("/**").allowedOrigins("*").allowedMethods("*");
			}
			
		};
	}

}
