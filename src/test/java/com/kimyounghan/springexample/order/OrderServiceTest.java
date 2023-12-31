package com.kimyounghan.springexample.order;

import com.kimyounghan.springexample.AppConfig;
import com.kimyounghan.springexample.member.Grade;
import com.kimyounghan.springexample.member.Member;
import com.kimyounghan.springexample.member.MemberService;
import com.kimyounghan.springexample.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
	AppConfig appConfig = new AppConfig();
	MemberService memberService = appConfig.memberService();
	OrderService orderService = appConfig.orderService();

	@Test
	void createOrder() {
		Long memberId =1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(member);

		Order order = orderService.createOrder(memberId, "itemA", 10000);
		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
	}
}
