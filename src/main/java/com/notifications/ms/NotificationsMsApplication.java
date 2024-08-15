package com.notifications.ms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationsMsApplication {

	private static final Logger logger = LoggerFactory.getLogger(NotificationsMsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(NotificationsMsApplication.class, args);
		logger.info("Welcome to Notifications Microservice!");

	}
}
