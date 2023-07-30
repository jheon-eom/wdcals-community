package com.wdcals.wdcommunity.jh.api;

import com.wdcals.wdcommunity.jh.dto.DeleteBoardRequestDto;
import com.wdcals.wdcommunity.jh.dto.SaveBoardRequestDto;
import com.wdcals.wdcommunity.jh.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/jh/api/board")
@RestController
public class BoardController {
    private final BoardService boardService;

    @PostMapping
    public ResponseEntity<Long> saveBoard(@RequestBody SaveBoardRequestDto saveBoardRequestDto) {

        return ResponseEntity.ok(boardService.saveBoard(saveBoardRequestDto));
    }

    @DeleteMapping
    public ResponseEntity<Long> deleteBoard(@RequestBody DeleteBoardRequestDto deleteBoardRequestDto) {

        return ResponseEntity.ok(boardService.deleteBoard(deleteBoardRequestDto));
    }
}
