package com.inho.phyculator.force.service;

import com.inho.phyculator.force.dto.request.ForceSpeedDTO;
import com.inho.phyculator.force.dto.response.ForceDTO;
import com.inho.phyculator.util.ValidChecker;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class ForceService {
    public ForceDTO getForce(ForceSpeedDTO forceSpeedDTO) {
        double firstSpeed = forceSpeedDTO.getFirstSpeed();
        double lastSpeed = forceSpeedDTO.getLastSpeed();
        double mass = forceSpeedDTO.getMass();
        double time = forceSpeedDTO.getTime();
        ValidChecker.timeValidCheck(time);
        return ForceDTO.builder().force((lastSpeed - firstSpeed) / time * mass).build();
    }


}
