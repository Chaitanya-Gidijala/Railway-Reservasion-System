package com.railway.seatavailability.service;

import com.railway.seatavailability.client.TrainServiceClient;
import com.railway.seatavailability.controller.SeatAvailabilityController;
import com.railway.seatavailability.dto.SeatAvailabilityDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SeatAvailabilityServiceImpl implements SeatAvailabilityService {
    private static final Logger log = LoggerFactory.getLogger(SeatAvailabilityController.class);

    @Autowired
    private TrainServiceClient trainServiceClient;

    @Override
    public SeatAvailabilityDTO checkSeatAvailability(String trainNumber, LocalDate date) {
        log.info("Checking seat availability for train: {} on {}", trainNumber, date);
        // ✅ Convert LocalDate to String
        String formattedDate = date.toString();
        return trainServiceClient.getSeatAvailability(trainNumber, formattedDate);
    }


}