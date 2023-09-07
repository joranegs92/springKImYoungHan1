package com.kimyounghan.springexample;

import com.kimyounghan.springexample.discount.FixDiscountPolicy;
import com.kimyounghan.springexample.discount.RateDiscountPolicy;
import com.kimyounghan.springexample.member.MemberService;
import com.kimyounghan.springexample.member.MemberServiceImpl;
import com.kimyounghan.springexample.member.MemoryMemberRepository;
import com.kimyounghan.springexample.order.Order;
import com.kimyounghan.springexample.order.OrderService;
import com.kimyounghan.springexample.order.OrderServiceImpl;

public class AppConfig {

	public MemberService memberService(){
		return new MemberServiceImpl(new MemoryMemberRepository());
	}

	public OrderService orderService(){
		return new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy(), new FixDiscountPolicy());
	}

}
