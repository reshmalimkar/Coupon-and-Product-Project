package com.jspider.cnp.model;

import java.math.BigDecimal;

public class Product {
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Description=" + Description + ", price=" + price
				+ ", couponCode=" + couponCode + "]";
	}
	private int id;
	private String name;
	private String Description;
	private BigDecimal price;
	private String couponCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
}
