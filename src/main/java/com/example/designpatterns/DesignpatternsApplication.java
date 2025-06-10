package com.example.designpatterns;

import com.example.designpatterns.singleton_logger.LogLevel;
import com.example.designpatterns.singleton_logger.Logger;
import com.example.designpatterns.singleton_logger.LoggerConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesignpatternsApplication.class, args);
	}

	@PostConstruct
	public void setupLogger(){
		LoggerConfig config = new LoggerConfig(LogLevel.DEBUG);
		Logger.INSTANCE.init(config);
	}

}