package com.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.board.repository.UserRepository;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;



@Api(tags = {"1. USer"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() throws Exception{
		
		List<UserVO> list = 
		
		
	}


}
