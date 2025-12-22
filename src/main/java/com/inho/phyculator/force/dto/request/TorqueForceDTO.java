package com.inho.phyculator.force.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TorqueForceDTO {
    private double firstSpeed;
    private double lastSpeed;
    private double mass;
    private double time;
    private double length;
}
