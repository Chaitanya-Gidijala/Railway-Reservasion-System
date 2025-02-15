package com.railway.seatavailability.client;

import com.railway.seatavailability.dto.SeatAvailabilityDTO;
import com.railway.seatavailability.exception.FeignErrorDecoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "train-service", url = "http://localhost:8081/api/trains", configuration = FeignErrorDecoder.class)
public interface TrainServiceClient {

    @GetMapping("/availability")
    SeatAvailabilityDTO getSeatAvailability(
            @RequestParam("trainNumber") String trainNumber,
            @RequestParam("date") String date  // Change LocalDate to String
    );
}

