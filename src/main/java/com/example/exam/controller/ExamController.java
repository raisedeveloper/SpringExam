package com.example.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.exam.entity.Member;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/exam")
public class ExamController {

    @GetMapping("/member")
    public String getMemberList(Model model) {
        List<Member> members = new ArrayList<>();
        members.add(new Member(1, "james", 27, "영국"));
        members.add(new Member(2, "maria", 35, "한국"));
        members.add(new Member(3, "eunice", 29, "미국"));
        members.add(new Member(4, "nicky", 10, "호주"));
        members.add(new Member(5, "wanda", 15, "중국"));        
        model.addAttribute("members", members);
        return "/board/memberList";
    }
}