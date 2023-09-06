package com.kimyounghan.springexample.order;

import com.kimyounghan.springexample.discount.DiscountPoilicy;
import com.kimyounghan.springexample.discount.FixDiscountPolicy;
import com.kimyounghan.springexample.member.Member;
import com.kimyounghan.springexample.member.MemberRepository;
import com.kimyounghan.springexample.member.MemberService;
import com.kimyounghan.springexample.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{


	private final MemberRepository memberRepository = new MemoryMemberRepository();
	private final DiscountPoilicy discountPoilicy = new FixDiscountPolicy();


	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepository.findById(memberId);
		/*
		* 설계가 잘된 부분... orderService는 dircountPolicy에게 할인 정책을 위임했다.
		* 단일체계원칙을 잘 지켰다.
		* 이부분이 문제가 생겼을때는 discountPolicy가서 수정하면 된다 여기는 수정안해도 됨
		* */
		int discountPrice = discountPoilicy.discount(member, itemPrice);

		return new Order(memberId,itemName,itemPrice,discountPrice);
	}
}
