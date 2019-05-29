package Prob2B;

public class OrderLine {
	private int linenum;
	private double price;
	private int quatity;
	private Order order;

	OrderLine(int linenum, double price, int quatity, Order order) {
		this.linenum = linenum;
		this.price = price;
		this.quatity = quatity;
		this.order = order;
	}

	public int getLineNum() {
		return this.linenum;
	}

	public double getPrice() {
		return this.price;
	}

	public int getQuatity() {
		return this.quatity;
	}

	public Order getOrder() {
		return this.order;
	}

	public String toString() {
		return linenum + "        " + price + "        " + quatity;
	}
}
