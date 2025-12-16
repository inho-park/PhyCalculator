package com.inho.phyculator.speed.service;

import static com.inho.phyculator.speed.message.ErrorMessage.ARITHMETIC_TIME_ERROR_MESSAGE;

import com.inho.phyculator.speed.dto.SpeedResultDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class SpeedService {
    public SpeedResultDTO getSpeed(double distance, double time) {
        speedValidCheck(distance, time);
        return SpeedResultDTO.builder().speed(distance / time).build();
    }

    public void speedValidCheck(double distance, double time) {
        if (time <= 0d) {
            throw new ArithmeticException(ARITHMETIC_TIME_ERROR_MESSAGE.getMessage());
        }
    }
}
