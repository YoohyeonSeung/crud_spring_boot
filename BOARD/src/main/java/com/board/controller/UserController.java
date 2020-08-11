package com.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.board.domain.UserVO;
import com.board.repository.UserRepository;
import com.board.mapper.UserMapper;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api(tags = {"1. User"})
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	// 회원 목록  -> ★ 관리자 모드에서만 볼 수 있음
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() throws Exception{
		
		List<UserVO> list = userMapper.userList();
		
		return new ModelAndView("userList", "list", list);
	}
	
	// 회원 정보 상세 보기 -> ★ 자신에 대한 정보만 수정 할 수 있도록 수정 필요
	@RequestMapping(value = "/{bno}", method = RequestMethod.GET)
	public ModelAndView view(@PathVariable("bno") int bno) throws Exception{
		
		UserVO user = userMapper.userView(bno);
		
		return new ModelAndView("userView", "user", user);
	} 	
		
	// 회원 정보 수정 
	@RequestMapping(value = "/post/{bno}", method = RequestMethod.PATCH)
	public RedirectView update(@ModelAttribute("UserVO") UserVO userVO, @PathVariable("bno") int bno) throws Exception{
		
		userMapper.userUpdate(userVO);
		
		return new RedirectView("/");
	}

	
	// 회원 삭제
	@RequestMapping(value = "/post/{bno}", method = RequestMethod.DELETE)
	public RedirectView delete(@PathVariable("bno") int bno) throws Exception{
		
		userMapper.userDelete(bno);
		
		return new RedirectView("/");
	}
}
