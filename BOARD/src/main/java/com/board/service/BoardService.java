package com.board.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.board.domain.Board;

public interface BoardService {
	
	Page<Board> findBoardList(Pageable pageable);
	Board findBoardByIdx(long idx);
	
}
