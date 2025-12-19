package com.inho.phyculator.speed.api;

import static com.inho.phyculator.message.ErrorMessage.DOUBLE_PARSE_ERROR_MESSAGE;

import com.inho.phyculator.speed.dto.request.AccelerationSpeedDTO;
import com.inho.phyculator.speed.dto.request.SpeedCoordinateDTO;
import com.inho.phyculator.speed.dto.request.SpeedDistanceDTO;
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
    public ResponseEntity getSpeedWithDistance(SpeedDistanceDTO speedDistanceDTO) {
        try {
            double distance = speedDistanceDTO.getDistance();
            double time = speedDistanceDTO.getTime();
            return new ResponseEntity<>(speedService.getSpeed(distance, time), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(DOUBLE_PARSE_ERROR_MESSAGE.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/coordinate")
    public ResponseEntity getSpeedWithCoordinate(SpeedCoordinateDTO speedCoordinateDTO) {
        try {
            double start = speedCoordinateDTO.getStart();
            double rear = speedCoordinateDTO.getRear();
            double time = speedCoordinateDTO.getTime();
            return new ResponseEntity<>(speedService.getSpeed(start, rear, time), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(DOUBLE_PARSE_ERROR_MESSAGE.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/acceleration")
    public ResponseEntity greAcceleration(AccelerationSpeedDTO accelerationSpeedDTO) {
        try {
            double firstSpeed = accelerationSpeedDTO.getFirstSpeed();
            double lastSpeed = accelerationSpeedDTO.getLastSpeed();
            double time = accelerationSpeedDTO.getTime();
            return new ResponseEntity<>(speedService.getAcceleration(firstSpeed, lastSpeed, time), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(DOUBLE_PARSE_ERROR_MESSAGE.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
