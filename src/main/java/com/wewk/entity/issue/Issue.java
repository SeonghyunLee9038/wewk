package com.wewk.entity.issue;

import com.wewk.entity.BaseEntity;
import com.wewk.entity.member.Member;
import com.wewk.entity.project.Project;
import com.wewk.entity.subject.Subject;
import com.wewk.enums.IssuePeriority;
import com.wewk.enums.IssueStatus;
import com.wewk.enums.IssueType;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "issue")
@Entity
public class Issue extends BaseEntity {

    @GeneratedValue
    @Id
    private Long issueNo;


    @Column(length = 100, nullable = false)
    private String issueTitle;

    @Column(length = 1000, nullable = false)
    private String issueCont;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "projectNo")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjectNo")
    private Subject subject;


    @Enumerated(EnumType.STRING)
    private IssueType issueType;

    @Where(clause = "deleteAt='N'")
    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    @JoinColumn(name = "parentId")
    private Issue parent;



    @Where(clause = "deleteAt='N'")
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentId")
    private List<Issue> children = new ArrayList<Issue>();


    @Column(length = 1, nullable = false)
    private String deleteAt = "N";


    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @Enumerated(EnumType.STRING)
    private IssuePeriority issuePriority;

    private LocalDateTime issueStartDt;

    private LocalDateTime issueEndDt;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberNo")
    private Member issueAssignee;

    //TODO watcher 추가


    public void addChild(Issue child) {
        this.children.add(child);
        child.setParent(this);
    }

    public void removeChild(Issue child) {
        this.children.remove(child);
        child.setParent(null);
    }


    public void setParent(Issue parent) {
        this.parent = parent;
    }

}