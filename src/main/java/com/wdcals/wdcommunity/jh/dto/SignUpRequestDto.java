package com.wdcals.wdcommunity.jh.dto;

import java.util.Objects;

public record SignUpRequestDto(String username) {

    public SignUpRequestDto {
        Objects.requireNonNull(username, "이름을 입력해주세요.");
    }
}
