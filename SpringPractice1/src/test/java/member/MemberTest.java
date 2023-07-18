package member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import member.service.MemberService;
import member.service.impl.MemberServiceImpl;

public class MemberTest {
	AppConfig ac = new AppConfig();
	MemberService ms = ac.memberServiceImpl();
	
	@Test
	@DisplayName("회원가입 테스트")
	void joinTest() {
		//given
		Member m1 = new Member(1L,"nameA","pass01");
		//when
		ms.join(m1);
		//then
		Member findMember = ms.findMember(m1);
		Assertions.assertEquals("nameA", findMember.getName());
	}
	
}
