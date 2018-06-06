package com.bharadwaj.spring.springcoreadvanced.injectinginterfaces;

public class OrderBOImpl implements OrderBO {

	private OrderDAO orderdao;

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBO implementation");
		orderdao.createOrder();
	}

	public OrderDAO getOrderdao() {
		return orderdao;
	}

	public void setOrderdao(OrderDAO orderdao) {
		this.orderdao = orderdao;
	}

}
