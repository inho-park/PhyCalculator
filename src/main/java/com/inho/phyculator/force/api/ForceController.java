package com.inho.phyculator.force.api;

import static com.inho.phyculator.message.ErrorMessage.DOUBLE_PARSE_ERROR_MESSAGE;

import com.inho.phyculator.force.dto.request.ForceSpeedDTO;
import com.inho.phyculator.force.dto.request.PressureForceDTO;
import com.inho.phyculator.force.dto.request.TorqueForceDTO;
import com.inho.phyculator.force.service.ForceService;
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
@RequestMapping("/force")
public class ForceController {
    final private ForceService forceService;

    @GetMapping("/speed")
    public ResponseEntity getForceWithSpeed(ForceSpeedDTO forceSpeedDTO) {
        try {
            return new ResponseEntity<>(forceService.getForce(forceSpeedDTO), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(DOUBLE_PARSE_ERROR_MESSAGE.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/torque")
    public ResponseEntity getTorque(TorqueForceDTO torqueForceDTO) {
        try {
            return new ResponseEntity<>(forceService.getTorque(torqueForceDTO), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(DOUBLE_PARSE_ERROR_MESSAGE.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/pressure")
    public ResponseEntity getPressure(PressureForceDTO pressureForceDTO) {
        try {
            return new ResponseEntity<>(forceService.getPressure(pressureForceDTO), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(DOUBLE_PARSE_ERROR_MESSAGE.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
