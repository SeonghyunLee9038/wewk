package com.wewk.entity.project;


import com.wewk.entity.BaseEntity;
import com.wewk.entity.member.Member;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "project")
public class Project extends BaseEntity {

    @GeneratedValue
    @Id
    private Long projectNo;

    private String projectNm;


    private String projectCont;

    private String projectStartDt;

    private String projectEndDt;

    @ManyToMany
    @JoinTable(name = "project_member_mapper",
            joinColumns = @JoinColumn(name = "project_no"),
            inverseJoinColumns = @JoinColumn(name = "mber_no"))
    private List<Member> members;




}
