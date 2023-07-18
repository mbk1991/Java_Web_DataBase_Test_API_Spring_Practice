package member.service.impl;

import org.springframework.stereotype.Component;

import member.Member;
import member.repository.MemberRepository;
import member.service.MemberService;

public class MemberServiceImpl implements MemberService{
	MemberRepository mr;
	
	public MemberServiceImpl(MemberRepository mr) {
		this.mr = mr;
	}
	
	@Override
	public void join(Member member) {
		mr.insertMember(member);
	}

	@Override
	public void login(Member member) {
		
	}

	@Override
	public void logout(Member member) {
		
	}

	@Override
	public Member findMember(Member member) {
		return mr.selectMemberById(member.getId());
		
	}

}
