package com.inho.phyculator.force.message;

import lombok.Getter;

@Getter
public enum ErrorMessage {
    ARITHMETIC_TIME_ERROR_MESSAGE("시간은 0 이상의 시간을 입력해주세요");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

}
