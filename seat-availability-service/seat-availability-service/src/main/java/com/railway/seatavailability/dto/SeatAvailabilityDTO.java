package com.railway.seatavailability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class SeatAvailabilityDTO {
    private String trainNumber;
    @JsonProperty("travelDate")
    private LocalDate date;
    private int availableSeats;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SeatAvailabilityDTO{" +
                "trainNumber='" + trainNumber + '\'' +
                ", date=" + date +
                ", availableSeats=" + availableSeats +
                '}';
    }
}