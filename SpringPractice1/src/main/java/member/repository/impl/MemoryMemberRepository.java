package member.repository.impl;

import java.util.HashMap;
import java.util.Map;

import member.Member;
import member.repository.MemberRepository;

public class MemoryMemberRepository implements MemberRepository{
	
	private Map<Long,Member> map = new HashMap<>();
	
	@Override
	public void insertMember(Member member) {
		map.put(member.getId(), member);
	}

	@Override
	public Map<Long, Member> selectAllMember() {
		return map;
	}

	@Override
	public Member selectMemberById(Long id) {
		return map.get(id);
	}
}
