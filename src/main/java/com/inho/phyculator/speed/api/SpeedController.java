package com.inho.phyculator.speed.api;

import com.inho.phyculator.speed.dto.SpeedRequestDTO;
import com.inho.phyculator.speed.service.SpeedService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/speed")
public class SpeedController {
    final private SpeedService speedService;

    @GetMapping("/distance")
    public ResponseEntity getSpeed(SpeedRequestDTO speedRequestDTO) {
        try {
            double distance = speedRequestDTO.getDistance();
            double time = speedRequestDTO.getTime();
            log.info("distance : " + distance);
            return new ResponseEntity<>(speedService.getSpeed(distance, time), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
