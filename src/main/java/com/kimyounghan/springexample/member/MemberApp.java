package com.kimyounghan.springexample.member;

import com.kimyounghan.springexample.AppConfig;

public class MemberApp {
	public static void main(String[] args) {
		AppConfig appConfig =new AppConfig();
		MemberService memberService = appConfig.memberService();
		Member member = new Member(1L, "조현수", Grade.VIP);
		memberService.join(member);

		Member findMember = memberService.findMember(1L);
		System.out.println("new member" +member.getName());
		System.out.println("findMember" +findMember.getName());
	}
}
