package com.example.springdemo.controller;

import com.example.springdemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // Autowired : Spring Container에 있는 MemberService를 연결시켜주는 기능이다. DI(의존성주입)
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
