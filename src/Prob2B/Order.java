package Prob2B;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int orderNum;
	private Date orderDate;
	private List<OrderLine> orderLines;

	public void addOrderLine(int linenum, double price, int quatity) {
		OrderLine orderLine = new OrderLine(linenum, price, quatity, this);
		orderLines.add(orderLine);
	}

	public Order(int orderNum, Date orderDate) {
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		orderLines = new ArrayList<>();
	}

	public List<OrderLine> getOrderLines() {
		return this.orderLines;
	}

	public int getOrderNum() {
		return this.orderNum;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	@Override
	public String toString() {
		String str = "";
		str += "OrderNum: " + orderNum + "\n";
		str += "OrderDate: " + orderDate + "\n";
		str += "----------OrderLine----------\n";
		str += "Num" + "     Price" + "     Quatity\n";
		for (OrderLine line : orderLines) {
			str += line.toString() + "\n";
		}
		return str;
	}
}
