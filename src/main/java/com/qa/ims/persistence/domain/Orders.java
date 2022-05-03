package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Orders {
	
	private Long order_id;
	private Long customer_id; 
	private String order_date;
	private Double total_cost;
	private int order_quantity;
	public Orders(Long order_id, Long customer_id, String order_date, Double total_cost, int order_quantity) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.order_date = order_date;
		this.total_cost = total_cost;
		this.order_quantity = order_quantity;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public Double getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(Double total_cost) {
		this.total_cost = total_cost;
	}
	public int getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}
	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", customer_id=" + customer_id + ", order_date=" + order_date
				+ ", total_cost=" + total_cost + ", order_quantity=" + order_quantity + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(customer_id, order_date, order_id, order_quantity, total_cost);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return Objects.equals(customer_id, other.customer_id) && Objects.equals(order_date, other.order_date)
				&& Objects.equals(order_id, other.order_id) && order_quantity == other.order_quantity
				&& Objects.equals(total_cost, other.total_cost);
	}
	
	

}
