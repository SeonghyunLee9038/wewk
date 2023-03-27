package com.wewk.controller;

import com.wewk.mapStruct.MemberMapper;
import com.wewk.vo.MemberJoinVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberMapper memberMapper;

    @GetMapping("/join")
    public String getMember() {
        return "pages/member/join";
    }

    @PostMapping("/join")
    public String postMember(MemberJoinVo memberJoinVo){
        System.out.println(memberMapper.joinVoToMember(memberJoinVo).toString());

        return "pages/member/join";
    }
}
