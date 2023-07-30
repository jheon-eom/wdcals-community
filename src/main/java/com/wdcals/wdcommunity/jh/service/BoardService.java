package com.wdcals.wdcommunity.jh.service;

import com.wdcals.wdcommunity.entity.Board;
import com.wdcals.wdcommunity.entity.Member;
import com.wdcals.wdcommunity.jh.dto.DeleteBoardRequestDto;
import com.wdcals.wdcommunity.jh.dto.SaveBoardRequestDto;
import com.wdcals.wdcommunity.jh.exception.BoardNotFoundException;
import com.wdcals.wdcommunity.jh.repository.BoardRepository;
import com.wdcals.wdcommunity.jh.repository.MemberRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public Long saveBoard(SaveBoardRequestDto saveBoardRequestDto) {
        Member member = memberRepository.findById(saveBoardRequestDto.memberId())
                        .orElseThrow(() -> new BoardNotFoundException("작성자가 존재하지 않습니다."));

        Board saveBoard = boardRepository.save(Board.builder()
                .title(saveBoardRequestDto.title())
                .content(saveBoardRequestDto.content())
                .isDeleted(false)
                .member(member)
                .build());

        return saveBoard.getId();
    }

    @Transactional
    public Long deleteBoard(DeleteBoardRequestDto deleteBoardRequestDto) {
        Board findBoard = boardRepository.findById(deleteBoardRequestDto.boardId())
                .orElseThrow(() -> new BoardNotFoundException("게시글이 존재하지 않습니다."));

        Assert.isTrue(findBoard.getMember().getId().equals(deleteBoardRequestDto.memberId()),
                "다른 작성자의 게시글입니다.");

        // soft delete
        findBoard.delete();

        return findBoard.getMember().getId();
    }
}
