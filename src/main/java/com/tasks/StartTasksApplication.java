package com.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tasks.one.first.config.IncDecConfigurationClass;

/**
 * Start to the Tasks application Note: Execution time check runs automatically
 * using Spring Configuration class {@link IncDecConfigurationClass}
 * 
 * @author cassiolemos
 *
 */
@SpringBootApplication
public class StartTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartTasksApplication.class, args);
	}

}
