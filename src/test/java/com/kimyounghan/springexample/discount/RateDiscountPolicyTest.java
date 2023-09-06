package com.kimyounghan.springexample.discount;

import com.kimyounghan.springexample.member.Grade;
import com.kimyounghan.springexample.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

	RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

	@Test
	@DisplayName("vip는 10%할인되야해")
	void vip() {
		Member member = new Member(1L,"mem", Grade.VIP);
		int discount =discountPolicy.discount(member, 10000);
		Assertions.assertThat(discount).isEqualTo(1000);
	}
}
