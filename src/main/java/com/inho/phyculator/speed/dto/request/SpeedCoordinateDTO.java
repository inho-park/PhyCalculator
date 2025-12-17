package com.inho.phyculator.speed.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpeedCoordinateDTO {
    private double start;
    private double rear;
    private double time;
}
