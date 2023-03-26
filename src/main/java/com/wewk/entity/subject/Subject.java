package com.wewk.entity.subject;

import com.wewk.entity.BaseEntity;
import com.wewk.entity.project.Project;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject  extends BaseEntity {

    @GeneratedValue
    @Id
    private Long subjectNo;

    @Column(length = 100, nullable = false)
    private String subjectNm;

    @Column(length = 1000, nullable = false)
    private String subjectCont;

    @Column(length = 1, nullable = false)
    private String deleteAt = "N";

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "projectNo")
    private Project project;



}
