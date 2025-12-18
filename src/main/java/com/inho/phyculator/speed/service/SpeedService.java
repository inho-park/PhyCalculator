package com.inho.phyculator.speed.service;

import static com.inho.phyculator.speed.message.ErrorMessage.ARITHMETIC_TIME_ERROR_MESSAGE;

import com.inho.phyculator.speed.dto.response.AccelerationDTO;
import com.inho.phyculator.speed.dto.response.SpeedDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class SpeedService {
    public SpeedDTO getSpeed(double distance, double time) {
        timeValidCheck(time);
        return SpeedDTO.builder().speed(distance / time).build();
    }

    public SpeedDTO getSpeed(double start, double rear, double time) {
        timeValidCheck(time);
        return SpeedDTO.builder().speed((rear - start) / time).build();
    }

    public void timeValidCheck(double time) {
        if (time <= 0d) {
            throw new ArithmeticException(ARITHMETIC_TIME_ERROR_MESSAGE.getMessage());
        }
    }
}
