package com.inho.phyculator.message;

import lombok.Getter;

@Getter
public enum ErrorMessage {
    ARITHMETIC_TIME_ERROR_MESSAGE("시간은 0 이상의 시간을 입력해주세요"),
    DOUBLE_PARSE_ERROR_MESSAGE("입력 값은 반드시 숫자로 입력해주세요");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

}
