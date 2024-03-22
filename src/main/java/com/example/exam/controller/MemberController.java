package com.example.exam.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.exam.entity.Member;
import com.example.exam.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberservice;
	
	@GetMapping("/insert")
	public String insertForm() {
		return "member/insert";
	}
	
	@PostMapping("/insert")
	public String insertProc(String name, int age, String country) {
		Member member = new Member(name, age, country);
		memberservice.insertMember(member);
		return "redirect:/member/list";
	}
	
	@GetMapping("/list")
	public String list (Model model)  {
		List<Member> memberList = memberservice.getMemberList();
		model.addAttribute("memberList" , memberList); 
		return "member/list";
	}
}