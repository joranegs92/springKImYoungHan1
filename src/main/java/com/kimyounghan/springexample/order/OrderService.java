package com.kimyounghan.springexample.order;

public interface OrderService {

	Order createOrder(Long memberId, String itemName, int itemPrice);

}
