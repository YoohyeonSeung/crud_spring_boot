package com.board;

import java.sql.Connection;
import javax.sql.DataSource;

import org.junit.Test;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.board.domain.BoardVO;
import com.board.domain.UserVO;
import com.board.mapper.BoardMapper;
import com.board.mapper.UserMapper;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@WebAppConfiguration
public class BoardApplicationTests {
	

	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private UserMapper userMapper;
	

//	@Test
//	public void contextLoads() {
//	}

	
//	@Test
//	public void testConnection() throws Exception{
//		
//		System.out.println("ds : "+ ds);
//		
//		Connection con = ds.getConnection();
//		
//		System.out.println("con : " + con);
//		
//		
//		con.close();
//	}
	
	
//	@Autowired
//	private SqlSessionFactory sqlSession;
//	
//	@Test
//	public void contextLoads() {
//	}
//	
//	@Test
//	public void testSqlSession() throws Exception{
//		System.out.println("sqlSession : "+ sqlSession);
//	}
	
	
//	@Test
//	public void testMapper() throws Exception{
//		
//		BoardVO vo = new BoardVO();
//		
//
//		vo.setSubject("�����Դϴ�.");
//		vo.setContent("�����Դϴ�.");
//		vo.setWriter("�ۼ����Դϴ�.");
//
//		mapper.boardInsert(vo);
//		
//	}
	
	@Test
	public void testUserMapper() throws Exception{
		
		UserVO vo = new UserVO();
		
		vo.setName("st");
		vo.setNickName("kosoto");
		vo.setPhoneNum("01077778888");
		vo.setEmail("kosoto@gmail.com");
		vo.setPassword("헤헤헤헤헤헿");
		vo.setUserId("kosoto");
		
		userMapper.userInsert(vo);
	}
	
	
	
}
