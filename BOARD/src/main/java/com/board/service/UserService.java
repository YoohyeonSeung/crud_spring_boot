package com.board.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.board.domain.User;

public interface UserService {
	
	Page<User> findUserList(Pageable pageable);
	User findUserByMsrl(long msrl);
	
	
}
