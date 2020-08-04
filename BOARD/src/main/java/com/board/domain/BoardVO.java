package com.board.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@XmlRootElement(name = "board")
@XmlType(propOrder = {"bno", "subject", "content", "writer", "reg_date", "hit"})
public class BoardVO {
	

    private int bno;


    private String subject;


	private String content;


    private String writer;


    private Date reg_date;

    
    private int hit;

    
}
