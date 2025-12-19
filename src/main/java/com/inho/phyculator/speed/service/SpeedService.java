package com.inho.phyculator.speed.service;

import com.inho.phyculator.speed.dto.response.AccelerationDTO;
import com.inho.phyculator.speed.dto.response.SpeedDTO;
import com.inho.phyculator.util.ValidChecker;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class SpeedService {
    public SpeedDTO getSpeed(double distance, double time) {
        ValidChecker.timeValidCheck(time);
        return SpeedDTO.builder().speed(distance / time).build();
    }

    public SpeedDTO getSpeed(double start, double rear, double time) {
        ValidChecker.timeValidCheck(time);
        return SpeedDTO.builder().speed((rear - start) / time).build();
    }

    public AccelerationDTO getAcceleration(double firstSpeed, double lastSpeed, double time) {
        ValidChecker.timeValidCheck(time);
        return AccelerationDTO.builder().acceleration((lastSpeed - firstSpeed) / time).build();
    }
}
