package member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import member.repository.MemberRepository;
import member.repository.impl.MemoryMemberRepository;
import member.service.MemberService;
import member.service.impl.MemberServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public MemberRepository memoryMemberRepository() {
		return new MemoryMemberRepository();
	}
	
	@Bean
	public MemberService memberServiceImpl() {
		return new MemberServiceImpl(memoryMemberRepository());
	}
}
