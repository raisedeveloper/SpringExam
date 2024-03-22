package com.example.exam.service;

import java.util.List;
import com.example.exam.entity.Member;

public interface MemberService {
	List<Member> getMemberList();
	
	void insertMember(Member member);
}