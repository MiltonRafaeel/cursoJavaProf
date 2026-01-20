package com.miltonrafael.desafio1.services;

import org.springframework.stereotype.Service;

import com.miltonrafael.desafio1.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {		
		if (order.getBasic() <= 99) {
			return 20;
		} 
		else if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0) {
			return 12.0;
		}
		else {
			return 0.0;
		}
	}
}
