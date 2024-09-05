package com.project.filter_fleet.service;

import java.util.List;

import com.project.filter_fleet.model.Member;

public interface MemberService {
	
	public List<Member> getAllMember(int teamId);
	public Member addNewMember(int teamId, Member member);
	public Member updateMember(int teamId, Member member);
	public boolean removeMember(int teamId, int memberId);
	public Member getMemberById(int teamId, int memberId);

}
