package com.tgroy.trackzilla;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tgroy.trackzilla.model.Application;
import com.tgroy.trackzilla.repository.ApplicationRepository;

@SpringBootApplication
public class TrackzillaApplication {

	private static final Logger logger = LoggerFactory.getLogger(TrackzillaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TrackzillaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("Trackzilla", "jane.doe", "Application for tracking bugs."));
			repository.save(new Application("Expenses", "john.marshall", "Application to track expense reports."));
			repository.save(new Application("Notifications","susan.jones", "Application to send alerts and notifications."));

			for (Application application : repository.findAll()) {
				logger.info("The application is: " + application.toString());
			}
		};
	}

}
