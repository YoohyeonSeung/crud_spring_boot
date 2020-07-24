package com.board.mapper;

import java.util.List;

import com.board.domain.UserVO;

public interface UserMapper {
	
	/*
	 * 관리자 모드에서 보여야 하는 부분은 ★ 로 표시 했습니다. 
	 * 
	 */	
	
	// 회원 추가
	public void userInsert(UserVO user) throws Exception;
	
	// 전체 회원 목록 ★
	public List<UserVO> userList() throws Exception;
	
	// 상세 회원 정보 보기
	public UserVO userView(int bno) throws Exception;
	
	/* 회원 정보 수정 - 비밀번호, email, 전화번호, 닉네임
	 * TODO : 만약 닉네임 수정시, 이 회원이 작성한 글의 작성자도 변경되어야 한다. 
 	 */ 
	public void userUpdate(UserVO userVO) throws Exception;
	
	// 회원 삭제
	public void userDelete(int bno) throws Exception;
	
	
	

}
