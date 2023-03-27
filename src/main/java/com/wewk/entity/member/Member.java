package com.wewk.entity.member;

import com.wewk.entity.BaseEntity;
import com.wewk.entity.project.Project;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.List;

@Getter @Setter @ToString
@Entity
@Table(name = "member")
public class Member extends BaseEntity {

    @Id
    @GeneratedValue
    private Long mberNo;

    @Column(length = 50, nullable = false, unique = true)
    private String mberId;

    private String mberNm;

    private String mberPw;

    private String mberEmail;


    @ManyToMany
    @JoinTable(name = "project_member_mapper",
            joinColumns = @JoinColumn(name = "mber_no"),
            inverseJoinColumns = @JoinColumn(name = "project_no"))
    private List<Project> projects;

}
