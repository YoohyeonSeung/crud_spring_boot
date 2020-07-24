package com.board.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.board.domain.User;
import com.board.repository.UserRepository;



public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Page<User> findUserList(Pageable pageable) {
		
		pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1, pageable.getPageSize() );		

		return userRepository.findAll(pageable);
	}

	@Override
	public User findUserByMsrl(long msrl) {
		return userRepository.findById(msrl).orElse(new User());
	}

}
