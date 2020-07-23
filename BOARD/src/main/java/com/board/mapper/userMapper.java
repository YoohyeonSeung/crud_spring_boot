package com.board.mapper;

import java.util.List;

import com.board.domain.UserVO;

public interface userMapper {
	
	/*
	 * 관리자 모드에서 보여야 하는 부분은 ★ 로 표시 했습니다. 
	 * 
	 */	
	
	// 회원 추가
	public void userInsert(UserVO user) throws Exception;
	
	// 회원 목록 ★
	public List<UserVO> userList() throws Exception;
	
	// 상세 회원 정보 보기
	public UserVO userView(int bno) throws Exception;
	
	//
	
	// TODO : Mapper 인터페이스 구현, mapper xml 만들기
	
	
	

}
