package member.service;

import member.Member;

public interface MemberService {
	void join(Member member);
	Member findMember(Member member);
	void login(Member member);
	void logout(Member member);
}
