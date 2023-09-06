package com.kimyounghan.springexample.discount;

import com.kimyounghan.springexample.member.Member;

public interface DiscountPoilicy {

	/**
	* @return 할인 대상 금액
	*/
	int discount(Member member, int price);



}
