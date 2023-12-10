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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public MemberService memberService(){
		return new MemberServiceImpl(memberRepository());
	}

	@Bean
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}

	@Bean
	public OrderService orderService(){
		return new OrderServiceImpl(memberRepository(), discountPoilicy());
	}

	@Bean
	public DiscountPoilicy discountPoilicy() {
		//return new FixDiscountPolicy(); <-- 얘만 바꾸면 됨
		return new RateDiscountPolicy();
	}
}
