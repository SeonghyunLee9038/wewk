package com.wewk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter
@Entity
@Table(name = "task")
public class TaskEntity {
    @Id
    @GeneratedValue
    private Long taskNo;

    private String taskNm;

    private String taskCont;

    private LocalDate taskStartDt;

    private LocalDate taskEndDt;

    @CreatedBy
    @ManyToOne
    private MemberEntity createMber;

    @CreatedBy
    private LocalDateTime createDt;

    @LastModifiedBy
    @ManyToOne
    private MemberEntity modifiMber;

    @CreatedBy
    private LocalDateTime modifiDt;



}
