package com.wewk.controller;

import com.wewk.vo.MemberLoginVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("")
    public String login() {
        return "login/join";
    }

    @PostMapping("")
    public String auth(MemberLoginVo memberLoginVo, HttpServletRequest request) {

        HttpSession session = request.getSession();


        session.setAttribute("memberId", memberLoginVo.getMemberId());
        return "login/auth";
    }
}
