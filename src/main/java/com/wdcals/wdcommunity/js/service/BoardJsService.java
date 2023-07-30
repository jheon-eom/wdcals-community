package com.wdcals.wdcommunity.js.service;

import com.wdcals.wdcommunity.entity.Board;
import com.wdcals.wdcommunity.js.repository.BoardJsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class BoardJsService {

    @Autowired
    private BoardJsRepository boardRepository;

    public Board write(Board board){
        return boardRepository.save(board);
    }

    @Transactional
    public void delete(long id){
        Optional<Board> optBoard = boardRepository.findById(id);
        if(optBoard.isPresent()){
            Board board = optBoard.get();
            board.setDeleted(true);
        }
    }
}
