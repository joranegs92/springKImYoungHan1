package com.kimyounghan.springexample;

import com.kimyounghan.springexample.member.MemberService;
import com.kimyounghan.springexample.member.MemberServiceImpl;

public class MemberApp {
	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
	}
}
