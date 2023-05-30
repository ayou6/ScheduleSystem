package com.example.ScheduleSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ScheduleSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleSystemApplication.class, args);
	}

}
