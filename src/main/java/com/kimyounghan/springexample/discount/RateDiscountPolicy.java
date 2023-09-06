package com.kimyounghan.springexample.discount;

import com.kimyounghan.springexample.member.Grade;
import com.kimyounghan.springexample.member.Member;

public class RateDiscountPolicy implements DiscountPoilicy{

	private int discountPercent = 10;

	@Override
	public int discount(Member member, int price) {
		if(member.getGrade() == Grade.VIP){
			return price * discountPercent / 100;
		}else {
			return 0;
		}
	}
}
