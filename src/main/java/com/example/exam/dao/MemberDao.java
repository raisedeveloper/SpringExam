package com.example.exam.dao;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.exam.entity.Member;

@Mapper
public interface MemberDao {

	@Select("select * from memeber")
	List<Member> getMemberList();
	
	@Insert("insert into member values(default, #{name}, #{age}, #{country})")
	void insert(Member member);
}