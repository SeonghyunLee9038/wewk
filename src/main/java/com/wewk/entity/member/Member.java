package com.wewk.entity;

import com.wewk.entity.project.Project;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@Entity
@Table(name = "member")
public class Member extends BaseEntity{

    @Id
    @GeneratedValue
    private Long mberNo;

    private String mberId;

    private String mberNm;

    private String mberPw;

    private String mberEmail;

    private String mberTelno;

    @ManyToMany
    @JoinTable(name = "project_member_mapper",
            joinColumns = @JoinColumn(name = "mber_no"),
            inverseJoinColumns = @JoinColumn(name = "project_no"))
    private List<Project> projects;

}
