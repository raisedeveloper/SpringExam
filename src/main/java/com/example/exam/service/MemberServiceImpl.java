
package com.example.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exam.dao.MemberDao;
import com.example.exam.entity.Member;

@Service
public class MemberServiceImpl implements MemberService {
@Autowired
private MemberDao memberDao;
	@Override
	public List<Member> getMemberList() {
		return memberDao.getMemberList(); 
	}

	@Override
	public void insertMember(Member member) {
		memberDao.insert(member);
	}
}