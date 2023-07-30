package com.wdcals.wdcommunity.js.service;

import com.wdcals.wdcommunity.entity.Board;
import com.wdcals.wdcommunity.js.repository.BoardJsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardJsService {

    @Autowired
    private BoardJsRepository boardRepository;

    public Board write(Board board){
        return boardRepository.save(board);
    }
}
