package com.board.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table
public class User {
	
	
	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long msrl;
	
	@Column(nullable = false, unique = true, length = 30)
	private String uid;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, unique = true, length = 20)
	private String nickname;
	
	@Column(nullable = false, length = 11)
	private int phoneNum;
	
	@Column(nullable = false, length = 30)
	private String email;	
}
