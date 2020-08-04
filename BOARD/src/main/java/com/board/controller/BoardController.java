package com.board.controller;

import java.net.URI;
import java.util.List;
import javax.ws.rs.core.Response;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.board.domain.BoardVO;
import com.board.mapper.BoardMapper;
import com.board.service.XmlService;
 
@RestController
@RequestMapping("/board")
public class BoardController {
 
    @Autowired
    private BoardMapper boardMapper;
    
    @Autowired
    private XmlService xmlService;
    
    
    //게시글 목록
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView list() throws Exception{
        
        List<BoardVO> list = boardMapper.boardList();
        
        return new ModelAndView("boardList","list",list);
    }
    
    //게시글 작성 페이지(GET)    
    @RequestMapping(value="/post",method=RequestMethod.GET)
    public ModelAndView writeForm() throws Exception{
        
        return new ModelAndView("boardWrite");
    }
    
    //게시글 작성(POST)   ->  
    @RequestMapping(value="/post",method=RequestMethod.POST)
    public RedirectView write(@ModelAttribute("BoardVO") BoardVO board) throws Exception{
 
        boardMapper.boardInsert(board);
        
        xmlService.createXmlBoard(board);
        
        /*
         * Redirect를 하는 기존 방법은 Class의 annotation을 @controller를 선언하고 함수의 반환 type을 String으로 하여 return "localhost:8080/board" 로 해야 됬었다.
         * 
         * 하지만 반환 타입을 RedirectView 로 하여 return RedirectView("some_url") 으로 하면 Class의 annotation을 @RestController로 할 수 있다.
         * 
         * 이때 some_url은 localhost:8080/board로 url전체로 할 필요 없이 가고자 하는 페이지로 하면된다. 
         */
        
        return new RedirectView("/board");          
    }
    
    //게시글 상세 보기
    @RequestMapping(value = "/{bno}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("bno") int bno) throws Exception{
    	
    	BoardVO board = boardMapper.boardView(bno);
    	boardMapper.hitPlus(bno);
    	
    	return new ModelAndView("boardView", "board", board);
    }
    
    // 게시글 수정 페이지(GET)
    @RequestMapping(value = "/post/{bno}", method = RequestMethod.GET)
    public ModelAndView updateForm(@PathVariable("bno") int bno) throws Exception{
    	
    	BoardVO board = boardMapper.boardView(bno);    	
    	
    	return new ModelAndView("boardUpdate", "board", board);
    }
    
    // 게시글 수정(PATCH)
    @RequestMapping(value = "/post/{bno}", method = RequestMethod.PATCH)
    public RedirectView update(@ModelAttribute("BoardVO") BoardVO boardVO, @PathVariable("bno") int bno) throws Exception{
    	
    	boardMapper.boardUpdate(boardVO);
    	
    	return new RedirectView("/board/"+bno);
    }
    
    // 게시글 삭제(DELETE)
    @RequestMapping(value = "/post/{bno}", method = RequestMethod.DELETE)
    public RedirectView delete(@PathVariable("bno") int bno) throws Exception{
    	boardMapper.boardDelete(bno);
    	
    	return new RedirectView("/board");
    }
    
    
    
    
}