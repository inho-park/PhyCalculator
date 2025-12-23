package com.inho.phyculator.force.message;

import lombok.Getter;

@Getter
public enum ErrorMessage {
    ARITHMETIC_AREA_ERROR_MESSAGE("단면적(area)은 0 이상의 시간을 입력해주세요");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

}
