package com.wewk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/member")
public class MemberController {

    @GetMapping("")
    public String getMember() {
        return "member";
    }

}
