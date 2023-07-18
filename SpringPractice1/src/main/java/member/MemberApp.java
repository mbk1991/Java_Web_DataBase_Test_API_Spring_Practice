package member;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import member.service.MemberService;
import member.service.impl.MemberServiceImpl;

public class MemberApp {
	public static void main(String[] args) {
		
//		AppConfig ac = new AppConfig();
//		MemberService ms = ac.memberServiceImpl();
		
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		MemberService ms = (MemberService) ac.getBean("memberServiceImpl");
		
		Member m1 = new Member(1L,"memberA","pass01");
		ms.join(m1);
		Member findMember = ms.findMember(m1);
		
		System.out.println("m1 "+ m1.getName());
		System.out.println("findMember " + findMember.getName());
				
	}
}
