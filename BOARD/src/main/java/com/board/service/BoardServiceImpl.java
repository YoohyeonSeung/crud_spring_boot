package com.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;



import com.board.domain.Board;
import com.board.repository.BoardRepository;



public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	
	@Override
	public Page<Board> findBoardList(Pageable pageable) {
		
		pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1, pageable.getPageSize() );		
		return boardRepository.findAll(pageable);
	}

	@Override
	public Board findBoardByIdx(long idx) {
		return boardRepository.findById(idx).orElse(new Board());
	}

}
