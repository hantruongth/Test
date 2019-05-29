package Prob2B.extpackage;

import java.util.Date;

import Prob2B.Order;

public class Main {

	public static void main(String[] args) {
		Date dt = new Date();
		Order order = new Order(1, dt);
		order.addOrderLine(1, 1.5, 1);
		order.addOrderLine(2, 2.5, 2);
		order.addOrderLine(3, 3.5, 3);

		System.out.println("Order: " + order.toString());
	}

}
