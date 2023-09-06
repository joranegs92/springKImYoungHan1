package com.kimyounghan.springexample.discount;

import com.kimyounghan.springexample.member.Grade;
import com.kimyounghan.springexample.member.Member;
// 정률 할인정책 .
public class FixDiscountPolicy implements DiscountPoilicy{

	private int discountFixAmount = 1000; //1000원할인


	@Override
	public int discount(Member member, int price) {
		if(member.getGrade() == Grade.VIP){
			return discountFixAmount;
		}
		return 0;
	}
}
