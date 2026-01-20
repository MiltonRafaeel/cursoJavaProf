package com.miltonrafael.desafio1.services;

import org.springframework.stereotype.Service;

import com.miltonrafael.desafio1.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;
	
	public OrderService() {
	super();
	}
	
	public OrderService(ShippingService shippingService) {
		super();
		this.shippingService = shippingService;
	}

	public double total(Order order) {
		double result = order.getBasic() * (order.getDiscount() / 100);
		return order.getBasic() - result + shippingService.shipment(order);
	}	
}
