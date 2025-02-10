package com.railway.trainservice.dto;

import java.time.LocalDate;

public class SeatAvailabilityDTO {
    private String trainNumber;
    private LocalDate travelDate;
    private int availableSeats;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalDate getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public SeatAvailabilityDTO(String trainNumber, LocalDate travelDate, int availableSeats) {
        this.trainNumber = trainNumber;
        this.travelDate = travelDate;
        this.availableSeats = availableSeats;
    }
}
