package com.kimyounghan.springexample;

import com.kimyounghan.springexample.member.MemberService;
import com.kimyounghan.springexample.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
	public static void main(String[] args) {
/*		AppConfig appConfig = new AppConfig();

		MemberService memberService = appConfig.memberService();*/

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MemberService memberService = applicationContext.getBean("memberService",MemberService.class); // 첫번째 변수는 이름, 두번째변수는타입이다
	}
}
