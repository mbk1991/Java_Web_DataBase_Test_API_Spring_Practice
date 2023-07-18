package member.repository;

import java.util.Map;

import member.Member;

public interface MemberRepository {
	void insertMember(Member member);
	Map<Long, Member> selectAllMember();
	Member selectMemberById(Long id);
}
