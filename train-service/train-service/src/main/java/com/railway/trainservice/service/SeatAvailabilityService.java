package com.railway.trainservice.service;

import com.railway.trainservice.dto.SeatAvailabilityDTO;
import com.railway.trainservice.entity.SeatAvailability;

import java.time.LocalDate;

public interface SeatAvailabilityService {
    SeatAvailability saveSeatAvailability(SeatAvailabilityDTO seatAvailabilityDTO);
}
