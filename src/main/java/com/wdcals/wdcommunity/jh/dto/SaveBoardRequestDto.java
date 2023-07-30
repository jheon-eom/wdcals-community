package com.wdcals.wdcommunity.jh.dto;

import com.wdcals.wdcommunity.entity.Member;

import java.util.Objects;

public record SaveBoardRequestDto(Long memberId, String title, String content) {

    public SaveBoardRequestDto {
        Objects.requireNonNull(memberId, "작성자가 존재하지 않습니다.");
        Objects.requireNonNull(title, "제목을 입력해주세요.");
        Objects.requireNonNull(content, "내용을 입력해주세요.");
    }
}
