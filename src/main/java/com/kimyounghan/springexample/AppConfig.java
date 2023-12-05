package com.kimyounghan.springexample;

import com.kimyounghan.springexample.discount.DiscountPoilicy;
import com.kimyounghan.springexample.discount.FixDiscountPolicy;
import com.kimyounghan.springexample.discount.RateDiscountPolicy;
import com.kimyounghan.springexample.member.MemberRepository;
import com.kimyounghan.springexample.member.MemberService;
import com.kimyounghan.springexample.member.MemberServiceImpl;
import com.kimyounghan.springexample.member.MemoryMemberRepository;
import com.kimyounghan.springexample.order.Order;
import com.kimyounghan.springexample.order.OrderService;
import com.kimyounghan.springexample.order.OrderServiceImpl;

public class AppConfig {

	public MemberService memberService(){
		return new MemberServiceImpl(memberRepository());
	}

	private MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}

	public OrderService orderService(){
		return new OrderServiceImpl(memberRepository(), discountPoilicy());
	}

	public DiscountPoilicy discountPoilicy() {
		return new FixDiscountPolicy();
	}
}
