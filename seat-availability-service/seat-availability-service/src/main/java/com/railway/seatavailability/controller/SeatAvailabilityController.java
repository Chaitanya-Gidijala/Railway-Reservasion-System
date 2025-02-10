package com.railway.seatavailability.controller;

import com.railway.seatavailability.dto.SeatAvailabilityDTO;
import com.railway.seatavailability.service.SeatAvailabilityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/seats")
@Tag(name = "Seat Availability Service", description = "Seat Availability API")
public class SeatAvailabilityController {

    private static final Logger log = LoggerFactory.getLogger(SeatAvailabilityController.class);

    @Autowired
    private SeatAvailabilityService seatAvailabilityService;

    @Operation(summary = "Check seat availability by train number and date")
    @GetMapping("/availability")
    public ResponseEntity<SeatAvailabilityDTO> checkSeats(
            @RequestParam String trainNumber,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        log.info("Checking seat availability for train: {} on {}", trainNumber, date);
        SeatAvailabilityDTO availability = seatAvailabilityService.checkSeatAvailability(trainNumber, date);
        return ResponseEntity.ok(availability);
    }



}