package com.railway.seatavailability.service;

import com.railway.seatavailability.dto.SeatAvailabilityDTO;

import java.time.LocalDate;

public interface SeatAvailabilityService {
    SeatAvailabilityDTO checkSeatAvailability(String trainNumber, LocalDate date);
}
