package com.railway.seatavailability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SeatAvailabilityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeatAvailabilityServiceApplication.class, args);
	}

}
