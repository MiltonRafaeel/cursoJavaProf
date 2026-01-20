package com.miltonrafael.desafio1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.miltonrafael.desafio1.entities.Order;
import com.miltonrafael.desafio1.services.OrderService;
import com.miltonrafael.desafio1.services.ShippingService;

@SpringBootApplication
public class Desafio1Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter with code the product: ");
		int code = scan.nextInt();
		scan.nextLine();
		System.out.print("enter with value basic: ");
		double valueBasic = scan.nextDouble();
		System.out.print("Enter with percent discount: ");
		double discount = scan.nextDouble();
		
		Order order = new Order(code, valueBasic, discount);
		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(shippingService);
		
		Double result = orderService.total(order);
		
		System.out.println();
		System.out.println("code order: " + order.getCode());
		System.out.printf("total value: %.2f ", result);
		
		scan.close();
		
	}
}
