package com.wewk.mapStruct;

import com.wewk.entity.member.Member;
import com.wewk.vo.MemberJoinVo;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemberMapperTest {

    MemberMapper memberMapper = Mappers.getMapper(MemberMapper.class);

    @Test
    void joinVoToMember() {

        //given
        MemberJoinVo memberJoinVo = new MemberJoinVo();
        memberJoinVo.setMberId("memberId");
        memberJoinVo.setMberNm("memberNm");
        memberJoinVo.setMberPw("memberPw");
        memberJoinVo.setMberEmail("memberEmail");

        //when
        memberMapper.toEntity(memberJoinVo);


        //then
        assertEquals(memberJoinVo.getMberId(), memberMapper.toEntity(memberJoinVo).getMberId());
        assertEquals(memberJoinVo.getMberNm(), memberMapper.toEntity(memberJoinVo).getMberNm());
        assertEquals(memberJoinVo.getMberPw(), memberMapper.toEntity(memberJoinVo).getMberPw());
        assertEquals(memberJoinVo.getMberEmail(), memberMapper.toEntity(memberJoinVo).getMberEmail());

    }


    @Test
    void memberToJoinVo() {

        //given
        Member member = new Member();
        member.setMberNo(1L);
        member.setMberId("memberId");
        member.setMberNm("memberNm");
        member.setMberPw("memberPw");
        member.setMberEmail("memberEmail");


        //when
        MemberJoinVo vo = memberMapper.toDto(member);

        //then
        assertEquals(member.getMberId(), vo.getMberId());
        assertEquals(member.getMberNm(), vo.getMberNm());
        assertEquals(member.getMberPw(), vo.getMberPw());
        assertEquals(member.getMberEmail(), vo.getMberEmail());


    }

    @Test
    void updateMemberForAll() {
        //given
        Member member = new Member();
        member.setMberNo(1L);
        member.setMberId("memberId");
        member.setMberNm("memberNm");
        member.setMberPw("memberPw");
        member.setMberEmail("memberEmail");

        MemberJoinVo memberJoinVo = new MemberJoinVo();
        //memberJoinVo.setMberId("memberId2");
        memberJoinVo.setMberNm("memberNm2");
        memberJoinVo.setMberPw("memberPw2");
        memberJoinVo.setMberEmail("memberEmail2");

        //when
        memberMapper.updateEntityForAll(memberJoinVo, member);

        //then
        assertEquals(memberJoinVo.getMberId(), null);
        assertEquals(memberJoinVo.getMberNm(), member.getMberNm());
        assertEquals(memberJoinVo.getMberPw(), member.getMberPw());
        assertEquals(memberJoinVo.getMberEmail(), member.getMberEmail());
    }

    @Test
    void updateMemberNotNull() {
        //given
        Member member = new Member();
        member.setMberNo(1L);
        member.setMberId("memberId");
        member.setMberNm("memberNm");
        member.setMberPw("memberPw");
        member.setMberEmail("memberEmail");

        MemberJoinVo memberJoinVo = new MemberJoinVo();
        //memberJoinVo.setMberId("memberId2");
        memberJoinVo.setMberNm("memberNm2");
        memberJoinVo.setMberPw("memberPw2");
        memberJoinVo.setMberEmail("memberEmail2");

        //when
        memberMapper.updateEntityForNotNull(memberJoinVo, member);

        //then
        assertNotEquals(memberJoinVo.getMberId(), member.getMberId());
        assertEquals(memberJoinVo.getMberId(), "memberId");
        assertEquals(memberJoinVo.getMberNm(), member.getMberNm());
        assertEquals(memberJoinVo.getMberPw(), member.getMberPw());
        assertEquals(memberJoinVo.getMberEmail(), member.getMberEmail());
    }


    @Test
    void joinVosToMembers() {

        //given
        List<MemberJoinVo> memberJoinVos = new ArrayList<>();
        MemberJoinVo memberJoinVo = new MemberJoinVo();
        memberJoinVo.setMberId("memberId1");
        memberJoinVo.setMberNm("memberNm1");
        memberJoinVo.setMberPw("memberPw1");
        memberJoinVo.setMberEmail("memberEmail1");

        memberJoinVos.add(memberJoinVo);

        MemberJoinVo memberJoinVo2 = new MemberJoinVo();
        memberJoinVo2.setMberId("memberId2");
        memberJoinVo2.setMberNm("memberNm2");
        memberJoinVo2.setMberPw("memberPw2");
        memberJoinVo2.setMberEmail("memberEmail2");

        memberJoinVos.add(memberJoinVo2);



        //when
        memberMapper.toEntityList(memberJoinVos);

        //then
        assertEquals(memberJoinVos.get(0).getMberId(), memberMapper.toEntityList(memberJoinVos).get(0).getMberId());
        assertEquals(memberJoinVos.get(0).getMberNm(), memberMapper.toEntityList(memberJoinVos).get(0).getMberNm());
        assertEquals(memberJoinVos.get(0).getMberPw(), memberMapper.toEntityList(memberJoinVos).get(0).getMberPw());
        assertEquals(memberJoinVos.get(0).getMberEmail(), memberMapper.toEntityList(memberJoinVos).get(0).getMberEmail());

        assertEquals(memberJoinVos.get(1).getMberId(), memberMapper.toEntityList(memberJoinVos).get(1).getMberId());
        assertEquals(memberJoinVos.get(1).getMberNm(), memberMapper.toEntityList(memberJoinVos).get(1).getMberNm());
        assertEquals(memberJoinVos.get(1).getMberPw(), memberMapper.toEntityList(memberJoinVos).get(1).getMberPw());
        assertEquals(memberJoinVos.get(1).getMberEmail(), memberMapper.toEntityList(memberJoinVos).get(1).getMberEmail());



    }
}