package com.board.domain;

import java.util.Date;

import lombok.Data;




@Data
public class BoardVO {
	
    private int bno;
    private String subject;
    private String content;
    private String writer;
    private Date reg_date;
    private int hit;

    
    
    
    
    
    
}
