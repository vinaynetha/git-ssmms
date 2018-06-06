package com.ssmms.ningw;

import org.apache.log4j.Logger;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
public class Application extends SpringBootServletInitializer{
	
	static Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication( Application.class);
        springApplication.setBannerMode(Banner.Mode.LOG);
        springApplication.run(args); 
	}
}
