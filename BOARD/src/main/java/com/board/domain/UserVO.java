package com.board.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class UserVO {
	
	@XmlElement
	private int bno;
	
	@XmlAttribute
	private String userId;

	@XmlAttribute
	private String name;

	@XmlAttribute
	private String nickName;

	@XmlAttribute
	private String phoneNum;

	@XmlAttribute
	private String email;
	private String password;
}
