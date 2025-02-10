package com.railway.searchservice.client;

import com.railway.searchservice.dto.TrainDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "train-service", url = "http://localhost:8081/api/trains")
public interface TrainServiceClient {
    @GetMapping("/search")
    List<TrainDTO> searchTrains(@RequestParam String source, @RequestParam String destination);
    @GetMapping("/number/{trainNumber}")
    TrainDTO getTrainByNumber(@PathVariable String trainNumber);}