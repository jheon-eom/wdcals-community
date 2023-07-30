package com.wdcals.wdcommunity.jh.dto;

import java.util.Objects;

public record DeleteBoardRequestDto(Long memberId, Long boardId) {

    public DeleteBoardRequestDto {
        Objects.requireNonNull(memberId, "작성자가 존재하지 않습니다.");
        Objects.requireNonNull(boardId, "게시글이 존재하지 않습니다.");
    }
}
