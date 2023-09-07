package com.kimyounghan.springexample;

import com.kimyounghan.springexample.member.Grade;
import com.kimyounghan.springexample.member.Member;
import com.kimyounghan.springexample.member.MemberService;
import com.kimyounghan.springexample.member.MemberServiceImpl;
import com.kimyounghan.springexample.order.Order;
import com.kimyounghan.springexample.order.OrderService;
import com.kimyounghan.springexample.order.OrderServiceImpl;

public class OrderApp {
	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		OrderService orderService = appConfig.orderService();
/*		MemberService memberService = new MemberServiceImpl();
		OrderService orderService = new OrderServiceImpl();*/

		Long memberId =1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(member);

		Order order = orderService.createOrder(memberId, "itemA", 10000);

		System.out.println(order);
		System.out.println(order.caclutaerPrice());
	}
}
