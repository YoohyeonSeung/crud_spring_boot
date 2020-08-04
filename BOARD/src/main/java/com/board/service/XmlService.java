package com.board.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;

import org.springframework.stereotype.Service;

import com.board.domain.BoardVO;
import com.board.domain.UserVO;


@Service
public class XmlService {

	
	public void createXmlBoard(BoardVO boardVO) {
		
		File file = new File("C://Users//juro2020-HS//Documents//board.xml");
		
		try {
			JAXBContext context = JAXBContext.newInstance(BoardVO.class);
			Marshaller marshaller = context.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); 
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	        marshaller.marshal(boardVO, new StreamResult(file));
						
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
