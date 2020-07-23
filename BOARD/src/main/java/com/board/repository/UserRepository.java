package com.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
