package com.board.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data; 
//import lombok.Setter;
//import lombok.Getter;

@Data
@NoArgsConstructor
@Entity
@Table
public class Board {    

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;
    
    @Column
    private String title;
    
    @Column
    private String content;
    
    @Column
    private LocalDateTime createdDate;
    
    @Column
    private LocalDateTime updatedDate;
    
    @Builder
    public Board(Long idx, String title, String content, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.idx = idx;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}