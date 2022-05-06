package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Products {
	
	private Long product_id;
	private String product_name;
	private Double cost;
	
	public Products(Long product_id, String product_name, Double cost) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.cost = cost;
	}
	
  
	public Products(String name, Double cost) {
		super();
		this.product_name = name;
		this.cost = cost;
	}


	public Long getId() {
		return product_id;
	}


	public void setId(Long product_id) {
		this.product_id = product_id;
	}


	public String getName() {
		return product_name;
	}


	public void setName(String product_name) {
		this.product_name = product_name;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Products [id=" + product_id + ", name=" + product_name + ", cost=" + cost + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cost, product_id, product_name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(product_id, other.product_id) && Objects.equals(product_name, other.product_name);
	}

	
}
