package com.wewk.controller;

import com.wewk.entity.member.MemberService;
import com.wewk.mapStruct.MemberMapper;
import com.wewk.vo.MemberJoinVo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
@AllArgsConstructor
public class MemberController {


    private final MemberMapper memberMapper;

    private final MemberService memberService;

    @GetMapping("")
    public String getMember() {
        return "pages/member/join";
    }

    @PostMapping("")
    public String postMember(@Validated MemberJoinVo memberJoinVo){
        memberService.save(memberMapper.toEntity(memberJoinVo));
        return "pages/member/join";
    }

}