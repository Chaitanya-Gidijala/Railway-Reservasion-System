package com.railway.searchservice.service;

import com.railway.searchservice.dto.TrainDTO;

import java.util.List;

public interface SearchService {
    List<TrainDTO> searchTrains(String source, String destination);
    TrainDTO searchByTrainNumber(String trainNumber);
}
