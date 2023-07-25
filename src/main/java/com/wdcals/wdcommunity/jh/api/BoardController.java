package com.wdcals.wdcommunity.jh.api;

import com.wdcals.wdcommunity.jh.dto.SaveBoardRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/jh/api")
@RestController
public class BoardController {

    @PostMapping("/board")
    public ResponseEntity<?> saveBoard(@RequestBody SaveBoardRequestDto saveBoardRequestDto) {

        return null;
    }
}
