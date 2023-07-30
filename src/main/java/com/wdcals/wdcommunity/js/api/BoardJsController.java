package com.wdcals.wdcommunity.js.api;

import com.wdcals.wdcommunity.entity.Board;
import com.wdcals.wdcommunity.js.service.BoardJsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/js/api")
@RestController
public class BoardJsController {
    private final BoardJsService boardJsService;

    @PostMapping("/board/write")
    public ResponseEntity<Board> boardWrite(@RequestBody Board board){

        return ResponseEntity.ok(boardJsService.write(board));
    }

    @DeleteMapping("/board/{id}")
    public String boardDelete(@PathVariable("id") long id){
        boardJsService.delete(id);

        return "ok";
    }
}
