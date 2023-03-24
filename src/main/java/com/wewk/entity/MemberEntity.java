package com.wewk.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter
@Entity
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue
    private Long mberNo;

    private String mberId;

    private String mberNm;

    private String mberPw;

    private String mberEmail;

    private String mberTelno;

}
